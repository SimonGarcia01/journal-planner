module com.annstationery {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.annstationery to javafx.fxml;
    exports com.annstationery;
}
