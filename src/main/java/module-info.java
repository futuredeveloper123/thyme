module kr.co.soft.thyme {
    requires javafx.controls;
    requires javafx.fxml;


    opens kr.co.soft.thyme to javafx.fxml;
    exports kr.co.soft.thyme;
}