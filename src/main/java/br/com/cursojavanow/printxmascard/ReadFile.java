package br.com.cursojavanow.printxmascard;

import java.net.URL;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;

public class ReadFile {

    final String toXmas1 = "/toXmas1.txt";

    public void caminho() {
        System.out.println(getClass().toString());
    }

    public void absoluteFilePath() {
        System.out.println(getClass().getResource(toXmas1));
    }

    public URL absoluteFilePathURL() {
        URL url = getClass().getResource(toXmas1);
        return url;
    }

    public File retornaFile() {
        URL url = getClass().getResource(toXmas1);
        File file = new File(url.getPath());
        return file;
    }

    public void readFile() {
        try {
            FileReader inputFile = new FileReader(retornaFile());
            int aCh;
            String mensagem = "";

            while ((aCh = inputFile.read()) != -1) {
                mensagem += (char) aCh;
            }

            System.out.println(mensagem);

        } catch (Exception e) {
            System.out.println("ERRO readFile " + e.getMessage());
        }

    }

    public String readMessage() {
        String line = null;
        try {
            Reader targetReader = new FileReader(retornaFile());
            BufferedReader bufferedReader = new BufferedReader(targetReader);
            line = bufferedReader.readLine();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("ERRO readMessage " + e.getMessage());
        }
        return line;
    }
}
