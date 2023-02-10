package Reception;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionBookingControl {
    public Label BilllId;
    public JFXTextField NameId;
    public JFXTextField NicId;
    public JFXTextField EmailId;
    public JFXTextField AddressId;
    public JFXTextField TeliId;
    public DatePicker ChekIndate;
    public DatePicker ChekOutDate;
    public JFXTextField ChekInTime;
    public JFXTextField ChekOutTime;

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Login.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


//Impliment
    public void CacelBookingtOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/ReceptionMaintain/BookinCansel.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
//impliment
    public void MaintainOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/ReceptionMaintain/Maintain.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    public void PrinBillOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/Reception/PrintBill.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void RoomBookingOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/Reception/ReceptionDashbord.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
