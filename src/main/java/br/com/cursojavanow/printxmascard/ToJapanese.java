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
            switch (c) {
                case 65:
                case 97:
                    ch = 12354;//あ
                    break;
                case 73:
                case 105:
                    ch = 12356;//い
                    break;
                case 85:
                case 117:
                    ch = 12358;//う
                    break;
                case 69:
                case 101:
                    ch = 12360;//え
                    break;
                case 79:
                case 111:
                    ch = 12362;//お
                    break;
                case 120:
                    ch = 12387;//っ
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("T");
        }
        return ch;
    }

}
