package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class CachorroController {

    @FXML
    private Button btcomer;

    @FXML
    private Button btdormir;

    @FXML
    private Button btlatir;

    @FXML
    private Label comer;

    @FXML
    private Label dormir;

    @FXML
    private ImageView imagembebida;

    @FXML
    private Label latir;

    @FXML
    void comer(ActionEvent event) {
        if (comer.getText().isEmpty()){
            comer.setText("comendo...");
            comer.setVisible(true);
        }
        else {}

    }

    @FXML
    void dormir(ActionEvent event) {
        if (dormir.getText().isEmpty()){
            dormir.setText("zzz...");
            dormir.setVisible(true);
        }
        else {}

    }

    @FXML
    void latir(ActionEvent event) {
        if (latir.getText().isEmpty()){
            latir.setText("auauau...");
            latir.setVisible(true);
        }
        else {}

    }
}
