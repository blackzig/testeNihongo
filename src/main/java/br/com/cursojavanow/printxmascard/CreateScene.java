/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;

public class CreateScene {

    public void initFX(JFXPanel fxPanel) {
        WebView webview = new WebView();
        webview.getEngine().load(
                "https://www.youtube.com/watch?v=W_unkh5cPzY"
        );
        fxPanel.setScene(new Scene(webview));
    }

}
