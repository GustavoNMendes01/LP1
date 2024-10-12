package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class BicicletaController {

    @FXML
    private Button btbuzinar;

    @FXML
    private Button btfreiar;

    @FXML
    private Button btpedalar;

    @FXML
    private Label buzinar;

    @FXML
    private Label freiar;

    @FXML
    private ImageView imagembebida;

    @FXML
    private Label pedalar;

    @FXML
    void buzinar(ActionEvent event) {
        if (buzinar.getText().isEmpty()){
            buzinar.setText("prim prim");
            buzinar.setVisible(true);
        }
        else {}

    }

    @FXML
    void freiar(ActionEvent event) {
        if (freiar.getText().isEmpty()){
            freiar.setText("freiando...");
            freiar.setVisible(true);
        }
        else {}

    }

    @FXML
    void pedalar(ActionEvent event) {
        if (pedalar.getText().isEmpty()){
            pedalar.setText("pedalando...");
            pedalar.setVisible(true);
        }
        else {}

    }

}
