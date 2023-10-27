module org.example {
    requires javafx.controls;
    requires org.jline;

    opens org.example to javafx.fxml;
    exports org.example;
}