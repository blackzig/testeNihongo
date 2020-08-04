/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author zigui
 */
public class CompareAnswerJPToBR {

    public static void verify(String ask, String answer) {
        System.out.println("ask " + ask + " answer " + answer);
        if (ask.equalsIgnoreCase("えっ!") && answer.equalsIgnoreCase("eh!")) {
            System.out.println("disgramado");
        } else {
            System.out.println("nope");
        }
    }

    public static void japaneseToPortuguese(KeyEvent evt, JTextField ask, JTextField answer) {
        switch (evt.getKeyCode()) {
            case 10://enter
                CompareAnswerJPToBR.verify(ask.getText(), answer.getText());
                break;
            default:
                break;
        }
    }

}
