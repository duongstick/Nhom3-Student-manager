package com.example.demo_student;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SecondSc {


    public ImageView img2;
    @FXML
    private ImageView img1;
    @FXML
    private Label name;


    public void name1(MouseEvent mouseEvent) {
        name.setText("Phạm Quốc Cường" + "\n" + "HAUI" + "\n" + "Thái Bình ");
    }

    public void name2(MouseEvent mouseEvent) {
        name.setText("Phan Doãn Đức" + "\n" + "HUST" + "\n" + "Thanh Hóa");
    }

    public void name3(MouseEvent mouseEvent) {
        name.setText("Nguyễn Đình Dũng" + "\n" + "PTIT" + "\n" + "Nghệ An");
    }

    public void name4(MouseEvent mouseEvent) {
        name.setText("Hoàng Ngọc Dũng" + "\n" + "HAUI" + "\n" + "Bắc Ninh");
    }

    public void name5(MouseEvent mouseEvent) {
        name.setText("Nguyễn Hải Dương" + "\n" + "UTT" + "\n" + "Bình Phước");
    }
}
