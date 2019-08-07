package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(event -> {
            Parent parent = null;
            try {
                parent = FXMLLoader.load(getClass().getResource("../window/sinov.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            button.getScene().getWindow().hide();
            stage.show();

        });
    }
}
