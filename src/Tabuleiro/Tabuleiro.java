package Tabuleiro;

import Dama.Cor;
import Dama.PecaDama;
import Dama.PosicaoDama;

public class Tabuleiro {

    private PecaDama[][] pecas;
    private Integer linhas;
    private Integer colunas;

    public Tabuleiro(Integer linhas, Integer colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.pecas = new PecaDama[linhas][colunas];
    }

    public PecaDama getPeca(int linha, int coluna) throws TabuleiroException {
        if (pecas[linha][coluna] == null)
            throw new TabuleiroException("Não há peças nessa posição!");

        return pecas[linha][coluna];
    }

    public void addPeca(PosicaoDama posicao, Cor cor) {
        this.pecas[posicao.getX()][posicao.getY()] = new PecaDama(posicao, cor);
    }

    public PecaDama[][] getPecas() {
        return pecas;
    }

    public Boolean posicaoOcupada(int x, int y){
        return pecas[x][y] != null;
    }

    public void removePeca(PosicaoDama posicao) {
        this.pecas[posicao.getX()][posicao.getY()] = null;
    }
}
