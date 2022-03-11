package fr.killya;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ComptableController {

    @FXML
    private TextField txtnuitééqté;

    @FXML
    private TextField txtnuitéemu;

    @FXML
    private TextField txtnuitéett;

    @FXML
    private TextField txtrepasqté;

    @FXML
    private TextField txtrepasmu;

    @FXML
    private TextField txtkmmu;

    public void initialize() {

        txtnuitéemu.setText("80");
        txtrepasmu.setText("27");
        txtkmmu.setText("0,03");

    }
}