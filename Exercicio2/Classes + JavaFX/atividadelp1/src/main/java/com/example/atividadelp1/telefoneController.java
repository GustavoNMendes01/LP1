package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class telefoneController {

    @FXML
    private Label atender;

    @FXML
    private Button btatender;

    @FXML
    private Button btdesligar;

    @FXML
    private Button bttocar;

    @FXML
    private Label desligar;

    @FXML
    private ImageView imagembebida;

    @FXML
    private Label tocar;

    @FXML
    void atender(ActionEvent event) {
        if (atender.getText().isEmpty()){
            atender.setText("alo?");
            atender.setVisible(true);
        }
        else {}

    }

    @FXML
    void desligar(ActionEvent event) {
        if (desligar.getText().isEmpty()){
            desligar.setText("desligando...");
            desligar.setVisible(true);
        }
        else {}

    }

    @FXML
    void tocar(ActionEvent event) {
        if (tocar.getText().isEmpty()){
            tocar.setText("primmm");
            tocar.setVisible(true);
        }
        else {}

    }

}
