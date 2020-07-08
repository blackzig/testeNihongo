/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard;

/**
 *
 * @author zigui
 */
public class WorkingWord {

    public static String concatLastCharacter(String sentence) {
        String sentenceReturn = null;
        try {
            int lengthSentenceMinusOne = sentence.length() - 1;
            Character ch = null;
            if (sentence.length() == 0) {
                ch = sentence.charAt(0);
            } else {
                ch = sentence.charAt(lengthSentenceMinusOne);
            }
            Character c = ToJapanese.hiragana(ch);
            sentenceReturn = sentence.substring(0, lengthSentenceMinusOne)
                    .concat(c.toString());
        } catch (Exception e) {
            System.out.println("Letra não reconhecida");
        }
        return sentenceReturn;
    }

}
