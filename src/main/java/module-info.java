module chess {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.mioopp to javafx.fxml;
    exports com.mioopp;
}