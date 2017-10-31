package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LevelsPane implements Initializable {


    public Button btnreturn;

    private BorderPane parentPane;


    LevelsPane (BorderPane inParent) {
        this.parentPane = inParent;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnreturn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{

                    parentPane.getChildren().clear();

                    Menu inicioMenu = new Menu();

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_view.fxml"));
                    loader.setController(inicioMenu);
                    parentPane.getChildren().add(loader.load());

                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        });

    }
}
