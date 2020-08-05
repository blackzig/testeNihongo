/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard.nihongo;

/**
 *
 * @author zigui
 */
public class Alfabeto {

    private static boolean charIsJapanese(char c) {
        return (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.HIRAGANA)
                || (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.KATAKANA)
                || (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
    }

    public static boolean checkIfLettersAreJapanese(String letters) {
        boolean b = charIsJapanese(letters.charAt(0));//testando a antepenúltima letra
        return b;
    }

    public static boolean theLastLetterIsAnN(String letters) {
        char c = letters.charAt(1);
        return c == 'n';
    }

}
