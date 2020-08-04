package br.com.cursojavanow.printxmascard.poker;

import java.util.List;

public class Poker {
    
    public static void main(String[] args){
        bankroll();
    }
    
    public static void bankroll(){
        List<PerfilBankroll> perfisBankroll = PerfilBankroll.perfis();
        for(PerfilBankroll p: perfisBankroll){
            System.out.println(p.getNome());
        }
    }
    
}
