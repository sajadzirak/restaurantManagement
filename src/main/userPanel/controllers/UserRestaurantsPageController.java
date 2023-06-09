package main.userPanel.controllers;

import main.classes.methods;
import main.userPanel.UserClient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.fxml.Initializable;

public class UserRestaurantsPageController implements Initializable{

    @FXML
    private TilePane centerTilePane;

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Label titleLabel;

    @FXML
    private HBox topMenu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            methods.addRestaurantsToTilePane(centerTilePane, 'U', UserClient.toServer, UserClient.fromServer);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
