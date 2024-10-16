package com.example.atividadelp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class hello {

    @FXML
    private Button bt1;

    @FXML
    private Button bt10;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;

    @FXML
    private Button bt4;

    @FXML
    private Button bt5;

    @FXML
    private Button bt6;

    @FXML
    private Button bt7;

    @FXML
    private Button bt8;

    @FXML
    private Button bt9;

    @FXML
    void Caneta(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastrarCaneta.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newstage = new Stage();
        newstage.setTitle("Classe Caneta");
        newstage.setScene(scene);
        newstage.show();

    }


    @FXML
    void bebida(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Cadastrobebida.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newstage = new Stage();
        newstage.setTitle("Classe Bebida");
        newstage.setScene(scene);
        newstage.show();
    }

    @FXML
    void bicicleta(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastroBicicleta.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newstage = new Stage();
        newstage.setTitle("Classe Bicicleta");
        newstage.setScene(scene);
        newstage.show();
    }

    @FXML
    void cachorro(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastroCachorro.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newstage = new Stage();
        newstage.setTitle("Classe Cachorro");
        newstage.setScene(scene);
        newstage.show();

    }

    @FXML
    void cafeteira(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastroCafeteira.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newstage = new Stage();
        newstage.setTitle("Classe Cafeteira");
        newstage.setScene(scene);
        newstage.show();

    }

    @FXML
    void carro(ActionEvent event) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastroCarro.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newstage = new Stage();
            newstage.setTitle("Classe Bebida");
            newstage.setScene(scene);
            newstage.show();
        }

    }

    @FXML
    void lavaroupas(ActionEvent event) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastroLavaroupas.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newstage = new Stage();
            newstage.setTitle("Classe LavaRoupas");
            newstage.setScene(scene);
            newstage.show();
        }

    }

    @FXML
    void livro(ActionEvent event) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastroLivro.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newstage = new Stage();
            newstage.setTitle("Classe Livro");
            newstage.setScene(scene);
            newstage.show();
        }

    }

    @FXML
    void porta(ActionEvent event) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastroPorta.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newstage = new Stage();
            newstage.setTitle("Classe Livro");
            newstage.setScene(scene);
            newstage.show();
        }

    }

    @FXML
    void telefone(ActionEvent event) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CadastroTelefone.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newstage = new Stage();
            newstage.setTitle("Classe Telefone");
            newstage.setScene(scene);
            newstage.show();
        }

    }

}
