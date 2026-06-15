module com.example.tallerestilo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tallerestilo to javafx.fxml;
    exports com.example.tallerestilo;
}