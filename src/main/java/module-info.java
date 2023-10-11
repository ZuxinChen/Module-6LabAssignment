module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.TipCalculator to javafx.fxml;
    opens com.example.ColorChooser to javafx.fxml;
    exports com.example.TipCalculator;
    exports com.example.ColorChooser;
}