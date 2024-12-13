package com.example.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        try {
            // Corrigindo o URL de conexão
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/crud", // Certifique-se de ajustar 'localhost', '5432' e 'crud' conforme sua configuração
                    "postgres", // Substitua pelo seu usuário do PostgreSQL
                    "382516" // Substitua pela sua senha do PostgreSQL
            );
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao estabelecer conexão com o banco de dados", e);
        }
    }
}
