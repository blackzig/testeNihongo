/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard.poker;

import java.util.ArrayList;
import java.util.List;

public class PerfilBankroll {

    private String nome;
    private int headUp;
    private int sitAndGo1Mesa;
    private int sitAndGo18Players;
    private int sitAndGo45Players;
    private int torneio;

    public static List<PerfilBankroll> perfis() {
        List<PerfilBankroll> perfisBankroll = new ArrayList<>();
        PerfilBankroll pb = new PerfilBankroll();
        pb.setNome("Muito Agressivo");
        pb.setHeadUp(20);
        pb.setSitAndGo1Mesa(30);
        pb.setSitAndGo18Players(40);
        pb.setSitAndGo45Players(50);
        pb.setTorneio(75);

        PerfilBankroll pb1 = new PerfilBankroll();
        pb1.setNome("Agressivo");
        pb1.setHeadUp(30);
        pb1.setSitAndGo1Mesa(50);
        pb1.setSitAndGo18Players(60);
        pb1.setSitAndGo45Players(75);
        pb1.setTorneio(100);

        PerfilBankroll pb2 = new PerfilBankroll();
        pb2.setNome("Normal");
        pb2.setHeadUp(40);
        pb2.setSitAndGo1Mesa(75);
        pb2.setSitAndGo18Players(85);
        pb2.setSitAndGo45Players(100);
        pb2.setTorneio(150);

        PerfilBankroll pb3 = new PerfilBankroll();
        pb3.setNome("Conservador");
        pb3.setHeadUp(50);
        pb3.setSitAndGo1Mesa(100);
        pb3.setSitAndGo18Players(125);
        pb3.setSitAndGo45Players(150);
        pb3.setTorneio(200);

        PerfilBankroll pb4 = new PerfilBankroll();
        pb4.setNome("Ultra Conservador");
        pb4.setHeadUp(75);
        pb4.setSitAndGo1Mesa(150);
        pb4.setSitAndGo18Players(175);
        pb4.setSitAndGo45Players(200);
        pb4.setTorneio(250);

        perfisBankroll.add(pb);
        perfisBankroll.add(pb1);
        perfisBankroll.add(pb2);
        perfisBankroll.add(pb3);
        perfisBankroll.add(pb4);

        return perfisBankroll;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHeadUp() {
        return headUp;
    }

    public void setHeadUp(int headUp) {
        this.headUp = headUp;
    }

    public int getSitAndGo1Mesa() {
        return sitAndGo1Mesa;
    }

    public void setSitAndGo1Mesa(int sitAndGo1Mesa) {
        this.sitAndGo1Mesa = sitAndGo1Mesa;
    }

    public int getSitAndGo18Players() {
        return sitAndGo18Players;
    }

    public void setSitAndGo18Players(int sitAndGo18Players) {
        this.sitAndGo18Players = sitAndGo18Players;
    }

    public int getSitAndGo45Players() {
        return sitAndGo45Players;
    }

    public void setSitAndGo45Players(int sitAndGo45Players) {
        this.sitAndGo45Players = sitAndGo45Players;
    }

    public int getTorneio() {
        return torneio;
    }

    public void setTorneio(int torneio) {
        this.torneio = torneio;
    }

}
