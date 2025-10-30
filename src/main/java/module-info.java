module com.example.spjavau04myshapesdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spjavau04myshapesdemo to javafx.fxml;
    exports com.example.spjavau04myshapesdemo;
}