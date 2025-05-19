module org.dastruct {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.dastruct to javafx.fxml;
    exports org.dastruct;
}