module org.example.pdftool {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.pdfbox;
    requires javafx.swing;
    requires java.logging;


    opens org.example.pdftool to javafx.fxml;
    exports org.example.pdftool;
}