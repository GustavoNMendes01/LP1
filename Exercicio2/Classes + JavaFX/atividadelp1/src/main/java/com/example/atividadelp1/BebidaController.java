package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class BebidaController {

    @FXML
    private Label abrirgarrafa;

    @FXML
    private Button btabrirgarrafa;

    @FXML
    private Button btfechargarrafa;

    @FXML
    private Button btservirbebida;

    @FXML
    private Label fechargarrafa;

    @FXML
    private ImageView imagembebida;

    @FXML
    private Label servirbebida;

    @FXML
    void abrirgarrafa(ActionEvent event) {
        if (abrirgarrafa.getText().isEmpty()) {
            abrirgarrafa.setText("Abrindo Garrafa...");
            abrirgarrafa.setVisible(true);
        }
        else {}

    }

    @FXML
    void fechargarrafa(ActionEvent event) {
        if (fechargarrafa.getText().isEmpty()) {
            fechargarrafa.setText("Fechando Garrafa...");
            fechargarrafa.setVisible(true);
        }
        else {}

    }

    @FXML
    void servir(ActionEvent event) {
        if (servirbebida.getText().isEmpty()) {
            servirbebida.setText("Servindo Bebida...");
            servirbebida.setVisible(true);
        }
        else {}

    }

}
