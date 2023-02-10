package FXML;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginController {
    public JFXTextField UserNameId;

    public Label InvalidId;
    public JFXPasswordField Password_Id;

    public void loginAction(ActionEvent actionEvent) throws IOException {
        if(UserNameId.getText().equals("admin")&& Password_Id.getText().equals("1234")){
            Parent root = FXMLLoader.load(getClass().getResource("/Admin/AdminDashbord.fxml"));
            Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else if(UserNameId.getText().equals("reception")&& Password_Id.getText().equals("1234")){
            Parent root = FXMLLoader.load(getClass().getResource("/Reception/ReceptionDashbord.fxml"));
            Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();

        }else {
            InvalidId.setText("Username or password invalid");
            UserNameId.setText("");
            Password_Id.setText("");

        }
        //passwod checup linee



    }
}
