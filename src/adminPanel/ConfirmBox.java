package adminPanel;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    public static void display(String message, String title){

        Stage window = new Stage();
        Label messageLabel;
        Button okButton;
        okButton = new Button("OK");
        messageLabel = new Label(message);
        okButton.setOnAction(
            e -> {
                window.close();
            }
        );

        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(messageLabel, okButton);
        layout.setStyle("-fx-spacing: 25px;-fx-font-family: Ubuntu;-fx-background-color: #edfdfb;"+
        "-fx-font-size: 16px;-fx-text-fill: #04030f;");
        okButton.setStyle("-fx-background-color: #ff0022;-fx-text-fill:#fff");
        // layout.getStylesheets().add("adminPanel.confirmBox.css");
        Scene scene = new Scene(layout, 300, 200);
        window.setTitle(title);
        window.setScene(scene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();
    }
}