module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.test to javafx.fxml;
    exports com.example.test;
}