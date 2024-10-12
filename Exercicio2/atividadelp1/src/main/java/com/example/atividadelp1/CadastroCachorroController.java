package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class CadastroCachorroController {

    @FXML
    private Button btcadastrar3;

    @FXML
    private ImageView imagembebida;

    @FXML
    void cadastrar3(ActionEvent event) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cachorro.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newstage = new Stage();
            newstage.setTitle("Classe Cachorro");
            newstage.setScene(scene);
            newstage.show();
        }

    }

}
