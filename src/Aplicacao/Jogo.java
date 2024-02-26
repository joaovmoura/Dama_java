package Aplicacao;

import Dama.PecaDama;
import Tabuleiro.Tabuleiro;

import java.util.Collection;

public class Jogo {


    private Tabuleiro tabuleiro;

    public Jogo() {
        this.tabuleiro = new Tabuleiro(8, 8);
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
}
