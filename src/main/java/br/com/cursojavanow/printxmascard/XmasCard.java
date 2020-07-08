package br.com.cursojavanow.printxmascard;

import javax.swing.JOptionPane;

public class XmasCard {

    private String destinatario;
    private String mensagem;
    private String remetente;

    public XmasCard() {
        iniciarCartao();
    }

    private void iniciarCartao() {
        destinatario = JOptionPane.showInputDialog("Digite o nome do destinatário: ");
        ReadFile r = new ReadFile();
        mensagem = r.readMessage();
        remetente = JOptionPane.showInputDialog("Digite o nome do remetente: ");
    }

    public void imprimirCartao() {
        System.out.println(destinatario + "\n");
        System.out.println(mensagem + "\n");
        System.out.println(remetente);
    }

}
