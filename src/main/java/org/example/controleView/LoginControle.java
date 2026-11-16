package org.example.controleView;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class LoginControle {

    @FXML
    private void entrar(ActionEvent event) {
        Navegacao.trocarTela(
                "/view/Inicio.fxml",
                (Node) event.getSource()
        );
    }
}