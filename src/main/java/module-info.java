module com.mansour.kaffa {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.mansour.kaffa to javafx.fxml;
    exports com.mansour.kaffa;
    exports com.mansour.kaffa.controller;
    opens com.mansour.kaffa.controller to javafx.fxml;
}