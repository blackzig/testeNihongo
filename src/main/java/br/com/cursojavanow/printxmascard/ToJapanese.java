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
/*
Hiragana
Range: 3040—309F Quantity of characters: 96

Katakana
Range: 30A0—30FF Quantity of characters: 96

CJK Radicals Supplement
Range: 2E80—2EFF Quantity of characters: 128



 */
public class ToJapanese {

    public static Character hiragana(char c) {
        Character ch = null;
        try {
            if (c == 65 || c == 97) {
                ch = 12354;//あ
            } else if (c == 73 || c == 105) {
                ch = 12356;//い
            }
        } catch (Exception e) {
            System.out.println("T");
        }
        return ch;
    }

}
