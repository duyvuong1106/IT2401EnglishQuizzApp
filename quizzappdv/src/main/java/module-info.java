module com.nldv.quizzappdv {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nldv.quizzappdv to javafx.fxml;
    exports com.nldv.quizzappdv;
}
