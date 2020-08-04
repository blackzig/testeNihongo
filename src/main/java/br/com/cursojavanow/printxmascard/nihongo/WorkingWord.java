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
public class WorkingWord {

    public static Character verifySyllable(String sentence) {
        Character ch = null;
        switch (sentence) {
            case "na":
                return ch = 12394;
            default:
                return ch;
        }
    }

    public static String checkTheLastTwoSyllables(String sentence) {
        if (sentence.length() == 2) {
            if (sentence.contains("!") || sentence.contains("?")) {
                return endOfSentenceWithTwoSyllables(sentence);
            } else {
                return verifySyllable(sentence).toString();
            }
        } else if (sentence.length() > 2) {
            String letters = sentence.substring(sentence.length() - 2,
                    sentence.length());
            return checkLetters(letters, sentence);
        } else {
            return sentence;
        }
    }

    private static String checkLetters(String letters, String sentence) {
        String senteceFinal = sentence.substring(0, sentence.length() - 2);
        boolean b = Alfabeto.checkIfLettersAreJapanese(letters);

        if (b) {
            return sentence;
        } else {
            boolean c = Alfabeto.theLastLetterIsAnN(letters);
            if (c) {
                Character ch = Hiragana.syllableForHiragana(letters.charAt(0));
                return senteceFinal.concat(ch.toString().concat("n"));
            } else {
                String sentenceReturn = sentence.substring(
                        sentence.length() - 2, sentence.length());
                return senteceFinal
                        .concat(verifySyllable(sentenceReturn).toString());
            }
        }
    }

    private static String endOfSentenceWithTwoSyllables(String sentence) {
        Character ch = Hiragana.syllableForHiragana(sentence.charAt(0));
        return ch.toString().concat(sentence.substring(1, 2));
    }

    public static String checkTheLastThreeLetters(String sentence) {
        String senteceFinal = sentence.substring(0, sentence.length() - 3);
        String last3Letters = sentence.substring(sentence.length() - 3,
                sentence.length());
        if (last3Letters.equalsIgnoreCase("ino")) {
            return senteceFinal.concat("いの");
        }
        return sentence;
    }
}
