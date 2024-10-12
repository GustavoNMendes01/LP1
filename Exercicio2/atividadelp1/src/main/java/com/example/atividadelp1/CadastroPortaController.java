package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class CadastroPortaController {

    @FXML
    private Button btcadastrar10;

    @FXML
    private ImageView imagembebida;

    @FXML
    void cadastrar10(ActionEvent event) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("porta.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newstage = new Stage();
            newstage.setTitle("Classe Porta");
            newstage.setScene(scene);
            newstage.show();
        }

    }
}
