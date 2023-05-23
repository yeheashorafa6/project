/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.awt.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class App extends Stage{
    TextField textField;
    Button button;
    public App(){
        // Create UI elements
        Label nameLabel = new Label("Name:");
        TextField nameTextField = new TextField();

        Label genderLabel = new Label("Gender:");
        ComboBox<String> genderComboBox = new ComboBox<>();
        genderComboBox.getItems().addAll("Male", "Female", "Other");

        Label dobLabel = new Label("Date of Birth:");
        DatePicker dobPicker = new DatePicker();

        Button registerButton = new Button("Register");
        registerButton.setOnAction(e -> {
            // Handle registration logic here
            String name = nameTextField.getText();
            String gender = genderComboBox.getValue();
            String dob = dobPicker.getValue().toString();

            // Perform necessary actions with the data (e.g., save to database)
            // ...

            // Display a success message
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText(null);
            successAlert.setContentText("Patient registered successfully!");
            successAlert.showAndWait();
        });

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new javafx.geometry.Insets(10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameTextField, 1, 0);
        gridPane.add(genderLabel, 0, 1);
        gridPane.add(genderComboBox, 1, 1);
        gridPane.add(dobLabel, 0, 2);
        gridPane.add(dobPicker, 1, 2);
        gridPane.add(registerButton, 0, 3, 2, 1);

        // Create scene and set it on the stage
        Scene scene = new Scene(gridPane, 300, 200);
        this.setScene(scene);
        this.show();
    }





        
    
}
