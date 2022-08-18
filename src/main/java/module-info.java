module com.example.demo_student {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_student to javafx.fxml;
    exports com.example.demo_student;
}