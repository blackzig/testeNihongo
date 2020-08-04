/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard;

import br.com.cursojavanow.printxmascard.nihongo.WorkingWord;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author zigui
 */
public class CompareAnswerBRToJP {

    public static void verify(String ask, String answer) {
        System.out.println("ask " + ask + " answer " + answer);
        if (ask.equalsIgnoreCase("eh!") && answer.equalsIgnoreCase("えっ!")) {
            System.out.println("disgramado");
        } else {
            System.out.println("nope");
        }
    }

//    public static void portugueseToJapanese(KeyEvent evt, JTextField ask, JTextField answer) {
//        String setenceJapanese = answer.getText();
//        switch (evt.getKeyCode()) {
//            case 10://enter
//                CompareAnswerBRToJP.verify(ask.getText(), answer.getText());
//                break;
//            default:
//                String newSentenceJapanese = WorkingWord
//                        .concatLastCharacter(setenceJapanese);
//                if (newSentenceJapanese != null) {
//                    answer.setText(newSentenceJapanese);
//                } else {
//                    answer.setText(setenceJapanese
//                            .substring(0, setenceJapanese.length() - 1));
//                }
//                break;
//        }
//    }

}
