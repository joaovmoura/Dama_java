package Aplicacao;

import Dama.PecaDama;
import Jogador.Jogador;
import Tabuleiro.Tabuleiro;

import java.util.Collection;

public class Jogo {


    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo(String j1Nome, String j2Nome) {
        this.tabuleiro = new Tabuleiro(8, 8);
        this.jogador1 = new Jogador(j1Nome);
        this.jogador2 = new Jogador(j2Nome);
        this.povoaTabuleiro();
    }


    private void povoaTabuleiro(){
        for(int i = 0; i < 3; i++)
            for(int j = 0; j<8; j++)
                if(i%2==0){
                    if(j%2 == 0){
                        this.tabuleiro.addPeca(i, j);
                        this.tabuleiro.addPeca(7-i, j);
                    }
                }else{
                    if(j%2 == 1){
                        this.tabuleiro.addPeca(i, j);
                        this.tabuleiro.addPeca(7-i, j);
                    }
                }
    }

    public PecaDama[][] getTabuleiro() {
        return this.tabuleiro.getPecas();
    }

    public String getJogador1() {
        return jogador1.getName();
    }

    public String getJogador2() {
        return jogador2.getName();
    }
}
