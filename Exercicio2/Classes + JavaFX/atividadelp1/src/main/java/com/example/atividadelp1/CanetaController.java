package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class CanetaController {

    @FXML
    private Label abrirtampa;

    @FXML
    private Button btescrever;

    @FXML
    private Button btfechartampa;

    @FXML
    private Button btabrirtampa;

    @FXML
    private Label escrever;

    @FXML
    private Label fechartampa;

    @FXML
    private ImageView imagembebida;

    @FXML
    void escrever(ActionEvent event) {
        if (escrever.getText().isEmpty()){
            escrever.setText("Você escreveu: Vai Corinthians!!!");
            escrever.setVisible(true);
        }
        else {}

    }

    @FXML
    void fechartampa(ActionEvent event) {
        if (fechartampa.getText().isEmpty()){
            fechartampa.setText("Tampa Fechada.");
            fechartampa.setVisible(true);
        }
        else {}

    }

    @FXML

    void abrirtampa(ActionEvent event) {
        if (abrirtampa.getText().isEmpty()){
            abrirtampa.setText("Tampa Aberta");
            abrirtampa.setVisible(true);
        }
        else {}

    }

}
