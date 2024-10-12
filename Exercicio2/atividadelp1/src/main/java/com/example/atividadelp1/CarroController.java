package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class CarroController {

    @FXML
    private Label acelerar;

    @FXML
    private Button btacelerar;

    @FXML
    private Button btdesligar;

    @FXML
    private Button btligarcarro;

    @FXML
    private Label ligar;

    @FXML
    private Label desligar;

    @FXML
    private ImageView imagembebida;

    @FXML
    void acelerar(ActionEvent event) {
        if (acelerar.getText().isEmpty()){
            acelerar.setText("vrummm");
            acelerar.setVisible(true);
        }
        else {}

    }

    @FXML
    void desligar(ActionEvent event) {
        if (desligar.getText().isEmpty()){
            desligar.setText("Carro desligado");
            desligar.setVisible(true);
        }
        else {}

    }

    @FXML
    void ligarcarro(ActionEvent event) {
        if (ligar.getText().isEmpty()){
            ligar.setText("Carro Ligado");
            ligar.setVisible(true);
        }
        else {}

    }

}
