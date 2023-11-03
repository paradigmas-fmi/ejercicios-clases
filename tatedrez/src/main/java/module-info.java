module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jline;

    opens org.example.controller to javafx.fxml;
    exports org.example;
}