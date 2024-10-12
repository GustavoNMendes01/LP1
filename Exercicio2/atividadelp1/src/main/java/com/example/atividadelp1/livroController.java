package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class livroController {

    @FXML
    private Label abrirlivro;

    @FXML
    private Button btabrirlivro;

    @FXML
    private Button btfecharlivro;

    @FXML
    private Button btlerlivro;

    @FXML
    private Label fecharlivro;

    @FXML
    private ImageView imagembebida;

    @FXML
    private Label lerlivro;

    @FXML
    void abrirlivro(ActionEvent event) {
        if (abrirlivro.getText().isEmpty()) {
            abrirlivro.setText("livro aberto");
            abrirlivro.setVisible(true);
        } else {
        }
    }

    @FXML
    void fechar(ActionEvent event) {
        if (fecharlivro.getText().isEmpty()) {
            fecharlivro.setText("livro fechado.");
            fecharlivro.setVisible(true);
        } else {
        }

    }

    @FXML
    void lerlivro(ActionEvent event) {
        if (lerlivro.getText().isEmpty()) {
            lerlivro.setText("lendo...");
            lerlivro.setVisible(true);
        } else {
        }

    }
}


