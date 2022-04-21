module com.group7.ist.custmngmnt {
    requires javafx.controls;
    requires gson;
    requires java.sql;
    requires javafx.fxml;
    requires java.base;

    opens com.group7.ist.custmngmnt to javafx.fxml;
    opens model to gson;
    opens controller to javafx.fxml;
    exports com.group7.ist.custmngmnt;
    exports controller;
}
