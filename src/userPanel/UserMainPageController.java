package userPanel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import adminPanel.FxmlLoader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class UserMainPageController implements Initializable{
   
    @FXML
    private Label cartIcon;

    @FXML
    private Label exitIcon;

    @FXML
    private VBox leftMenu;

    @FXML
    private BorderPane mainPane;

    @FXML
    private Label restaurantsIcon;

    @FXML
    private Label userIcon;

    @FXML
    private Label walletIcon;


    @FXML
    void cartLabelClicked(MouseEvent event) {
        changeOpacity(cartIcon.getId());
    }

    @FXML
    void exitLabelClicked(MouseEvent event) throws IOException {
        changeOpacity(exitIcon.getId());
        UserClient.toServer.writeObject("exit");
        UserClient.window.close();
    }

    @FXML
    void restaurantsLabelClicked(MouseEvent event) throws IOException {
        changeOpacity(restaurantsIcon.getId());
        mainPane.setCenter(new FxmlLoader().getPage("../userPanel/userRestaurantsPage.fxml"));
    }

    @FXML
    void userLabelClicked(MouseEvent event) {
        changeOpacity(userIcon.getId());
    }

    @FXML
    void walletLabelClicked(MouseEvent event) {
        changeOpacity(walletIcon.getId());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeOpacity(userIcon.getId());
    }

    private void changeOpacity(String id){
        String selectedOpacity = "-fx-opacity: 60%;";
        String defaultOpacity = "-fx-opacity: 100%;";
        for(Node label : leftMenu.getChildren()){
            if(label.getId().equals(id)){
                label.setStyle(selectedOpacity);
            }
            else{
                label.setStyle(defaultOpacity);
            }
        }
    }
}
