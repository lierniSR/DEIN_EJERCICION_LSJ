module es.liernisarraoa.dein_ejercicion_lsj {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.liernisarraoa.dein_ejercicion_lsj to javafx.fxml;
    exports es.liernisarraoa.dein_ejercicion_lsj;
}