package org.example.controleView;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class PerfilControle {

    @FXML
    private void abrirInicio(ActionEvent event) {
        Navegacao.trocarTela("/view/Inicio.fxml",
                (Node) event.getSource());
    }

    @FXML
    private void abrirDisciplinas(ActionEvent event) {
        Navegacao.trocarTela("/view/Disciplinas.fxml",
                (Node) event.getSource());
    }

    @FXML
    private void abrirHorarios(ActionEvent event) {
        Navegacao.trocarTela("/view/Horarios.fxml",
                (Node) event.getSource());
    }

    @FXML
    private void abrirNotas(ActionEvent event) {
        Navegacao.trocarTela("/view/Notas.fxml",
                (Node) event.getSource());
    }

    @FXML
    private void abrirAtividades(ActionEvent event) {
        Navegacao.trocarTela("/view/Atividades.fxml",
                (Node) event.getSource());
    }

    @FXML
    private void abrirPerfil(ActionEvent event) {
    }
}

