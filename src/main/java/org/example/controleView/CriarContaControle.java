package org.example.controleView;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class CriarContaControle {

    @FXML
    private void abrirLogin(ActionEvent event) {
        Navegacao.trocarTela(
                "/view/Login.fxml",
                (Node) event.getSource()
        );
    }
}