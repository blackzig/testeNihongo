/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;

public class SwingJavaFX {

    public static void ShowGUI() {
        CreateScene cs = new CreateScene();
        final JFrame frame = new JFrame("JavaFX / Swing Integrated");
        final JFXPanel fxPanel = new JFXPanel();
        frame.setSize(500, 500);
        frame.add(fxPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Platform.runLater(() -> {
            cs.initFX(fxPanel);
        });
        
    }
    


}
