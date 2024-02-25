package Dama;

import Tabuleiro.PosicaoTabuleiro;

public class PosicaoDama {

    private PosicaoTabuleiro posicao;

    public PosicaoDama(int x, int y) {
        this.posicao = new PosicaoTabuleiro(x, y);
    }

    public void setPosicao (int x, int y){
        this.posicao.setX(x);
        this.posicao.setY(y);
    }
}
