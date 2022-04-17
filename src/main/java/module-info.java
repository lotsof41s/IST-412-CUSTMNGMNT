module com.group7.ist.custmngmnt {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.group7.ist.custmngmnt to javafx.fxml;
    exports com.group7.ist.custmngmnt;
}
