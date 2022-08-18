package com.example.demo_student;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginCtr {
    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent actionEvent) {
        checklogin();
    }

    private void checklogin() {
        HelloApplication main = new HelloApplication();
        if (username.getText().toString().equals("ahihi") && password.getText().toString().equals("123")){
            wrongLogIn.setText("dang nhap thanh cong");

            main.changeScene("hello-view.fxml");
        } else if (username.getText().isEmpty()) {
            wrongLogIn.setText("usename khong the de trong");

        } else if (password.getText().isEmpty()) {
            wrongLogIn.setText("password khong the de trong");
        } else {
            wrongLogIn.setText("password or usename sai");
        }
    }
}
