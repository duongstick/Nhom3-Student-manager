package com.example.demo_student;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

public class HelloController implements Initializable {
    @FXML
    private TableView<Student> tableView;

    @FXML
    private TableColumn<Student, Integer> idColumn;

    @FXML
    private TableColumn<Student, String> nameColumn;

    @FXML
    private TableColumn<Student, String> birthdayColumn;

    @FXML
    private TableColumn<Student, String> ageColumn;

    private ObservableList<Student> studentList;

    @FXML

    private TextField idText;

    @FXML

    private TextField idName;

    @FXML
    private TextField idBirthday;

    @FXML
    private TextField idAge;

    @Override

    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentList = FXCollections.observableArrayList(
                new Student(1, "Cường", "25/07/2000", 22),
                new Student(2, "Đức", "24/10/1998", 24),
                new Student(3, "Đình Dũng", "25/07/1998", 24),
                new Student(4, "Hoàng Dũng", "11/12/1999", 23),
                new Student(5, "Dương ICM", "14/08/2000", 22)
        );

        idColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        birthdayColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("birthday"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("age"));
        tableView.setItems(studentList);
        idColumn.setSortType(TableColumn.SortType.DESCENDING);
        idColumn.setSortable(false);

    }

    //private Alert
    @FXML
    private void clearFields() {
        idText.clear();
        idName.clear();
        idAge.clear();
        idBirthday.clear();

    }
    private Alert createAlert(Alert.AlertType type, String content, String header, String title, ButtonType... buttonTypes) {
        Alert alert = this.createAlert(type, content, header, title);
        alert.getButtonTypes().addAll(buttonTypes);
        return alert;
    }

    private Alert createAlert(Alert.AlertType type, String content, String header, String title) {
        Alert alert = new Alert(type, content);
        alert.setHeaderText(header);
        alert.setTitle(title);
        return alert;
    }

    private boolean checkInput() {
        boolean isValid = true;
        if (idText.getText().isEmpty() || idText.getText().isEmpty() ) {
            isValid = false;
        }

        return isValid;
    }

    public void addStudent (ActionEvent e) {
        boolean valid = checkInput();
        if (!valid) {
            Alert warn = this.createAlert(Alert.AlertType.WARNING, "Chưa điền đủ thông tin", "", "Điền thông tin", ButtonType.CLOSE);
            warn.show();
            return;
        }
        Student newStudent = new Student();
        newStudent.setId(Integer.parseInt(idText.getText()));
        newStudent.setName(idName.getText());
        newStudent.setBirthday(idBirthday.getText());
        newStudent.setAge(Integer.parseInt(idAge.getText()));
        studentList.add(newStudent);
        this.clearFields();

    }

    public void  deleteStudent(ActionEvent e) {
        Student selected = tableView.getSelectionModel().getSelectedItem();
        studentList.remove(selected);
    }



    @FXML
    void openSc(){
        FXMLLoader fxmlLoader=new FXMLLoader((getClass().getResource("Second_sc.fxml")));
        try {
            Scene scene=new Scene(fxmlLoader.load());
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println(e);;
        }

    }
    public void changeStudent(ActionEvent e) {
        Student sl = tableView.getSelectionModel().getSelectedItem();
        idText.setText(String.valueOf(sl.getId()));
        idText.setEditable(false);
        idText.isDisable();
        idName.setText(String.valueOf(sl.getName()));
        idBirthday.setText(String.valueOf(sl.getBirthday()));
        idAge.setText(String.valueOf(sl.getAge()));
    }

    public void updateStudent(ActionEvent e) {
        Student sl = tableView.getSelectionModel().getSelectedItem();
        sl.setId(Integer.parseInt(idText.getText()));
        sl.setName(idName.getText());
        sl.setBirthday(idBirthday.getText());
        sl.setAge(Integer.parseInt(idAge.getText()));
        tableView.refresh();
        this.clearFields();
    }


}