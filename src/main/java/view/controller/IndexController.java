package view.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class IndexController implements Initializable {

    @FXML
    private Label status;

    @FXML
    private ProgressIndicator progress;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

          new Thread(() ->{
                 teste();
          }).start();
    }
    public void teste(){
        for (int i = 0; i < 10; i++) {
            if(i > 8){
                Platform.runLater(() ->status.setText("100% Concluido"));
                return;
            }
            int finalI = i;
            Platform.runLater(() ->status.setText((finalI +1)+"0% Atualizado"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        };

}
