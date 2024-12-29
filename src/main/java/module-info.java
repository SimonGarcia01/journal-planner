module com.annsstationery.journalplanner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.annsstationery.journalplanner to javafx.fxml;
    exports com.annsstationery.journalplanner;
}