/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class VideoPlayer {

//    public static void main(String[] args) {
//        launch(args);
//    }

    public static void start() throws Exception {
        Stage stage = new Stage();
        WebView webview = new WebView();
        webview.getEngine().load(
                "https://www.youtube.com/watch?v=W_unkh5cPzY"
        );
        webview.setPrefSize(640, 390);

        stage.setScene(new Scene(webview));
        stage.show();
    }
}
