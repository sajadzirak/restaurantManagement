package main.userPanel.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Modality;
import javafx.stage.Stage;
import main.server.DataBase;
import main.userPanel.UserClient;

public class UserProfilePageController implements Initializable{

    private Stage paymentStage;

    @FXML
    private VBox addressContainer;

    @FXML
    private TextFlow addressTextFlow;

    @FXML
    private HBox balanceContainer;

    @FXML
    private Label balanceLabel;

    @FXML
    private Button editButton;

    @FXML
    private Label emailLabel;

    @FXML
    private AnchorPane mainContainer;

    @FXML
    private VBox mainInfoContainer;

    @FXML
    private Label phoneNumberLabel;

    @FXML
    private Label usernameLabel;

    @FXML
    private Button signOutButton;

    @FXML
    void editButtonClicked(ActionEvent event) {
        
    }

    @FXML
    void paymentButtonClicked(ActionEvent event) throws IOException {
        paymentStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource(DataBase.userViewPath+"paymentPage.fxml")); 
        paymentStage.setScene(new Scene(root));
        paymentStage.setTitle("payment page");
        paymentStage.initModality(Modality.APPLICATION_MODAL);
        paymentStage.setResizable(false);
        paymentStage.showAndWait();
        initialize(null, null);
    }

    @FXML
    void signOutButtonClicked(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usernameLabel.setText(UserClient.currentUser.getUsername());
        phoneNumberLabel.setText(UserClient.currentUser.getPhoneNumber());
        emailLabel.setText("email: "+UserClient.currentUser.getEmail());
        addressTextFlow.getChildren().clear();
        addressTextFlow.getChildren().add(new Text("\nAddress: "+UserClient.currentUser.getAddress()));
        balanceLabel.setText("$ "+UserClient.currentUser.getBalance());
    }
    
}
