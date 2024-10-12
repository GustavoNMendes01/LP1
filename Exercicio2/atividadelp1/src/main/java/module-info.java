module com.example.atividadelp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atividadelp1 to javafx.fxml;
    exports com.example.atividadelp1;
}