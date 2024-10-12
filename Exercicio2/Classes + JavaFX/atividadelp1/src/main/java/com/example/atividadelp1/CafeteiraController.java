package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class CafeteiraController {

    @FXML
    private Button btdesligar;

    @FXML
    private Button btfazercafe;

    @FXML
    private Button btligar;

    @FXML
    private Label desligar;

    @FXML
    private Label fazercafe;

    @FXML
    private ImageView imagembebida;

    @FXML
    private Label ligar;

    @FXML
    void desligar(ActionEvent event) {
        if (desligar.getText().isEmpty()) {
            desligar.setText("Desligando...");
            desligar.setVisible(true);
        }
        else {}

    }

    @FXML
    void fazercafe(ActionEvent event) {
        if (fazercafe.getText().isEmpty()) {
            fazercafe.setText("Café Pronto.");
            fazercafe.setVisible(true);
        }
        else {}

    }

    @FXML
    void ligar(ActionEvent event) {
        if (ligar.getText().isEmpty()) {
            ligar.setText("ligando...");
            ligar.setVisible(true);
        }
        else {}

    }

}
