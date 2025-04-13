module com.mystudyspace.mystudyspace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mystudyspace to javafx.fxml;
    exports com.mystudyspace;
}