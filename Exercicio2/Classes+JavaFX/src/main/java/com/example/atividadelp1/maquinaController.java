package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class maquinaController {

    @FXML
    private Button btacentrifugar;

    @FXML
    private Button btdesligarmaq;

    @FXML
    private Button btlavarroupas;

    @FXML
    private Label centrifugar;

    @FXML
    private Label desligarmaq;

    @FXML
    private ImageView imagembebida;

    @FXML
    private Label lavar;

    @FXML
    void abrir(ActionEvent event) {
        if (centrifugar.getText().isEmpty()){
            centrifugar.setText("centrifugando...");
            centrifugar.setVisible(true);
        }
        else {}

    }

    @FXML
    void desligarmaq(ActionEvent event) {
        if (desligarmaq.getText().isEmpty()){
            desligarmaq.setText("desligando...");
            desligarmaq.setVisible(true);
        }
        else {}

    }

    @FXML
    void lavar(ActionEvent event) {
        if (lavar.getText().isEmpty()){
            lavar.setText("lavando...");
            lavar.setVisible(true);
        }
        else {}

    }

}
