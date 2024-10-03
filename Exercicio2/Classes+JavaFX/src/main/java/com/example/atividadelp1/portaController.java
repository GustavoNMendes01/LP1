package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class portaController {

    @FXML
    private Label abrir;

    @FXML
    private Button btabrir;

    @FXML
    private Button btfechar;

    @FXML
    private Button bttrancarporta;

    @FXML
    private Label fechar;

    @FXML
    private ImageView imagembebida;

    @FXML
    private Label trancar;

    @FXML
    void abrir(ActionEvent event) {
        if (abrir.getText().isEmpty()){
            abrir.setText("porta aberta");
            abrir.setVisible(true);
        }
        else {}

    }

    @FXML
    void fechar(ActionEvent event) {
        if (fechar.getText().isEmpty()){
            fechar.setText("porta fechada");
            fechar.setVisible(true);
        }
        else {}

    }

    @FXML
    void trancar(ActionEvent event) {
        if (trancar.getText().isEmpty()){
            trancar.setText("porta trancada");
            trancar.setVisible(true);
        }
        else {}

    }

}
