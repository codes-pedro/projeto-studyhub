package org.example.controleView;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Navegacao {

    public static void trocarTela(String caminho, Node componente) {
        try {
            URL arquivo = Navegacao.class.getResource(caminho);

            if (arquivo == null) {
                throw new IllegalArgumentException(
                        "Tela não encontrada: " + caminho
                );
            }

            Parent root = FXMLLoader.load(arquivo);

            Stage stage = (Stage) componente.getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(
                    "Erro ao carregar a tela: " + caminho, e
            );
        }
    }
}