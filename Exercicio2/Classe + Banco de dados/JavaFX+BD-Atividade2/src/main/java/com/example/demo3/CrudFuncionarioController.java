package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.math.BigDecimal;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CrudFuncionarioController  implements Initializable {

    private FuncionarioDAO dao;

    @Override
    public void initialize(URL argO, ResourceBundle arg1 ) {
        try {
            dao = new FuncionarioDAO();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        idFuncionario.setCellValueFactory(new PropertyValueFactory<>("id"));
        nomeFuncionario1.setCellValueFactory(new PropertyValueFactory<>("nome"));
        nascimentoFuncionario1.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
        salarioFuncionario1.setCellValueFactory(new PropertyValueFactory<>("salario"));
        cargoFuncionario1.setCellValueFactory(new PropertyValueFactory<>("cargo"));
    }

    @FXML
    private Tab atualizar;

    @FXML
    private Tab cadastrar;

    @FXML
    private TextField cargoFuncionario;

    @FXML
    private TextField cargoNovoFuncionario;

    @FXML
    private Tab consultar;

    @FXML
    private TableView<Funcionario> funcionario;

    @FXML
    private TableColumn<Funcionario, Integer> idFuncionario;

    @FXML
    private TableColumn<Funcionario, String> nomeFuncionario1;

    @FXML
    private TableColumn<Funcionario, BigDecimal> salarioFuncionario1;

    @FXML
    private TableColumn<Funcionario, java.time.LocalDate> nascimentoFuncionario1;

    @FXML
    private TableColumn<Funcionario, String> cargoFuncionario1;

    @FXML
    private DatePicker nascimentoFuncionario;

    @FXML
    private DatePicker nascimentoNovoFuncionario;

    @FXML
    private TextField nomeConsultaFuncionario;

    @FXML
    private TextField nomeFuncionario;

    @FXML
    private TextField nomeNovoFuncionario;

    @FXML
    private TextField salarioFuncionario;

    @FXML
    private TextField salarioNovoFuncionario;

    @FXML
    void consultarFuncionarios(ActionEvent event) {
        List<Funcionario> resultado = dao.consultar(nomeConsultaFuncionario.getText());
        funcionario.getItems().clear();
        funcionario.getItems().addAll(resultado);
    }
    @FXML
    void gerenciarAbas() {

    }

    @FXML
    void limparCadastroNovoFuncionario(ActionEvent event) {
        nomeNovoFuncionario.clear();
        salarioNovoFuncionario.clear();
        cargoNovoFuncionario.clear();
        nascimentoNovoFuncionario.setValue(null);
    }

    private void LimparCadastroAtualizacaoFuncionario() {
        nomeNovoFuncionario.clear();
        nascimentoFuncionario.setValue(null);
        salarioFuncionario.clear();
        cargoFuncionario.clear();
    }
    @FXML
    void salvarNovoFuncionario(ActionEvent event) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nomeNovoFuncionario.getText());
        funcionario.setCargo(cargoNovoFuncionario.getText());
        funcionario.setSalario(new BigDecimal(salarioNovoFuncionario.getText()));
        funcionario.setDataNascimento(nascimentoNovoFuncionario.getValue());
        dao.cadastrar(funcionario);
        alerta("Cadastrado com sucesso");
        limparCadastroNovoFuncionario(event);
    }

    private void alerta(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

}
