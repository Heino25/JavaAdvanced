module com.example.heino.layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.heino.layouts to javafx.fxml;
    exports com.example.heino.layouts;
}