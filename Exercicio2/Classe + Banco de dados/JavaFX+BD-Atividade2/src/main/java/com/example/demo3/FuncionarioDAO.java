package com.example.demo3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private Connection connection;

    public FuncionarioDAO() throws ClassNotFoundException {
        connection = new ConnectionFactory().getConnection();
    }

    // Método para cadastrar um funcionário
    public void cadastrar(Funcionario funcionario) {
        String sql = "insert into funcionario(nome, data_nascimento, cargo, salario) values(?,?,?,?) ";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setDate(2, funcionario.getDataNascimentoSql());
            stmt.setString(3, funcionario.getCargo());
            stmt.setBigDecimal(4, funcionario.getSalario());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Método para consultar funcionários pelo nome
    public List<Funcionario> consultar(String nomeConsultaFuncionario) {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "select * from funcionario where nome like ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, "%" + nomeConsultaFuncionario + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Funcionario funcionario = new Funcionario();
                    funcionario.setId(rs.getInt("id"));
                    funcionario.setNome(rs.getString("nome"));
                    funcionario.setDataNascimentoFromSqlDate(rs.getDate("data_nascimento"));
                    funcionario.setCargo(rs.getString("cargo"));
                    funcionario.setSalario(rs.getBigDecimal("salario"));

                    funcionarios.add(funcionario);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return funcionarios;
    }

    // Método para atualizar os dados de um funcionário
    public void atualizar(Funcionario funcionario) {
        String sql = "update funcionario set nome=?, data_nascimento=?, cargo=?, salario=? where id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setDate(2, funcionario.getDataNascimentoSql());
            stmt.setString(3, funcionario.getCargo());
            stmt.setBigDecimal(4, funcionario.getSalario());
            stmt.setInt(5, funcionario.getId());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // Método para deletar um funcionário
    public void deletar(Integer idFuncionario) {
        String sql = "delete from funcionario where id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idFuncionario);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
