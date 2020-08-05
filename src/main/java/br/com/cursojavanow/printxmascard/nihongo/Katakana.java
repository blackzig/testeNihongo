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
public class Katakana {

    public static Character syllableForKatakana(char c) {
        Character ch = null;
        try {
            switch (c) {
                case 65: //unicode A
                    ch = 12450;//ア
                    break;
                case 73:
                    ch = 12452;//イ
                    break;
                case 85:
                    ch = 12454;//ウ
                    break;
                case 69:
                    ch = 12456;//エ
                    break;
                case 79:
                    ch = 12458;//オ
                    break;
                case 120:
                    ch = 12483;//ッ
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("K");
        }
        return ch;
    }

    public static Character verifySyllable(String sentence) {
      //  System.out.println("sentence katakana " + sentence);
        Character ch = null;
        switch (sentence) {
            case "TO":
                return ch = 12392;
            case "BO":
                return ch = 12508;
            case "RO":
                return ch = 12525;
            default:
                return 32;//espaço
        }
    }

}
