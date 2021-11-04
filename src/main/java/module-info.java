module com.example.tkxdpm_ndt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tkxdpm_ndt to javafx.fxml;
    exports com.example.tkxdpm_ndt;
}