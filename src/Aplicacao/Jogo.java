package Aplicacao;

import Tabuleiro.Tabuleiro;

public class Jogo {


    private Tabuleiro tabuleiro;

    public Jogo() {
        this.tabuleiro = new Tabuleiro(10, 10);
        this.povoaTabuleiro();
    }


    private void povoaTabuleiro(){
        for(int i = 0; i < 4; i++)
            for(int j = 0; j<10; j++)
                if(j%2 == 0){
                    this.tabuleiro.addPeca(i, j);
                    this.tabuleiro.addPeca(9-i, j);
                }
    }
}
