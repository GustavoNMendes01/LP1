package com.example.demo3;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Funcionario {
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private String cargo;
    private BigDecimal salario;


    public Funcionario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public Date getDataNascimentoSql() {
        return dataNascimento == null ? null : Date.valueOf(dataNascimento);
    }
    public void setDataNascimentoFromSqlDate(Date dataNascimentoSql) {
        this.dataNascimento = dataNascimentoSql != null ? dataNascimentoSql.toLocalDate() : null;
    }
}
