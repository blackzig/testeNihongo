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
/*
Hiragana
Range: 3040—309F Quantity of characters: 96

Katakana
Range: 30A0—30FF Quantity of characters: 96

CJK Radicals Supplement
Range: 2E80—2EFF Quantity of characters: 128



 */
public class Hiragana {

    public static Character syllableForHiragana(char c) {
        Character ch = null;
        try {
            switch (c) {
                case 97: //unicode a
                    ch = 12354;//あ
                    break;
                case 105:
                    ch = 12356;//い
                    break;
                case 117:
                    ch = 12358;//う
                    break;
                case 101:
                    ch = 12360;//え
                    break;
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
            System.out.println("H");
        }
        return ch;
    }

    public static Character verifySyllable(String sentence) {
        Character ch = null;
        switch (sentence) {
            case "ka":
                return ch = 12363;
            case "su":
                return ch = 12377;
            case "x": //っ
                return ch = 12387;
            case "de":
                return ch = 12391;
            case "na":
                return ch = 12394;
            case "no":
                return ch = 12398;
            default:
                return 32;//espaço
        }
    }

}
