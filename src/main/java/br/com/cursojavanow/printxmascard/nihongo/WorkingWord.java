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

    private static String alreadyHaveJapaneseWord(String sentence) {
        boolean a = Alfabeto.checkIfLettersAreJapanese(sentence);

        if (a) {
            String senteceFinal = sentence.substring(0, sentence.length() - 2);
            String last2Letters = sentence.substring(sentence.length() - 2,
                    sentence.length());
            Character sc = last2Letters.charAt(1);
            if (sc == null) {
                return sentence;
            } else {
                return hiraganaOrKatakana(sentence, senteceFinal);
            }
        } else {
            return hiraganaOrKatakana(sentence);
        }
    }

    private static String hiraganaOrKatakana(String sentence) {
        //true maiúscula - false minúscula
        boolean b = sentence.equals(sentence.toUpperCase());
        if (b) {
            return Katakana.verifySyllable(sentence).toString();
        } else {
            return Hiragana.verifySyllable(sentence).toString();
        }

    }

    private static String hiraganaOrKatakana(String sentence,
            String senteceFinal) {
        //true maiúscula - false minúscula
        boolean b = sentence.equals(sentence.toUpperCase());
        if (b) {
            if (senteceFinal.isBlank()) {
                System.out.println("Sempre aqui");
                return sentence;
            } else {
                System.out.println("ACHO QUE NUNCA ENTRA AQUI");
                return senteceFinal.concat(Katakana.verifySyllable(sentence)
                        .toString());
            }
        } else {
            System.out.println("ACHO QUE NUNCA ENTRA AQUI 1");
            return senteceFinal.concat(Hiragana.verifySyllable(sentence)
                    .toString());
        }
    }

    private static String theSyllableIsInUppercaseOrLowercase(String sentence,
            String senteceFinal) {
        //true maiúscula - false minúscula
        boolean b = sentence.equals(sentence.toUpperCase());
        String sentenceReturn = sentence.substring(
                sentence.length() - 2, sentence.length());
        if (b) {
            return senteceFinal
                    .concat(Katakana.verifySyllable(sentenceReturn)
                            .toString());
        } else {
            return senteceFinal
                    .concat(Hiragana.verifySyllable(sentenceReturn)
                            .toString());
        }
    }

    public static String checkTheLastTwoSyllables(String sentence) {
        if (sentence.length() == 2) {
            if (sentence.contains("!") || sentence.contains("?")) {
                return endOfSentenceWithTwoSyllables(sentence);
            } else {
                if (sentence.contains("x")) {//contém tsu
                    return containsSmallTsu(sentence);
                } else {
                    return alreadyHaveJapaneseWord(sentence);
                }
            }
        } else if (sentence.length() > 2) {
            String letters = sentence.substring(sentence.length() - 2,
                    sentence.length());
            return checkLetters(letters, sentence);
        } else {
            return sentence;
        }
    }

    private static String containsSmallTsu(String sentence) {
        Character fc = sentence.charAt(0);
        Character sc = sentence.charAt(1);
        fc = Hiragana.syllableForHiragana(fc);
        sc = Hiragana.verifySyllable(sc.toString());
        return fc.toString().concat(sc.toString());
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
                return theSyllableIsInUppercaseOrLowercase(sentence,
                        senteceFinal);
            }
        }
    }

    private static String endOfSentenceWithTwoSyllables(String sentence) {
        Character ch = Hiragana.syllableForHiragana(sentence.charAt(0));

        if (ch != null) {
            return ch.toString().concat(sentence.substring(1, 2));
        } else {
            return sentence;
        }

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
