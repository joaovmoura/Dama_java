package Tabuleiro;

import Dama.Cor;
import Dama.PecaDama;

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

    public void addPeca(int i, int j, Cor cor) {
        this.pecas[i][j] = new PecaDama(i, j, cor);
        this.pecas[i][j].setPosicaoDama(i, j);
    }

    public PecaDama[][] getPecas() {
        return pecas;
    }

    public Boolean posicaoOcupada(int x, int y){
        return pecas[x][y] != null;
    }

    public void removePeca(int x, int y) {
        this.pecas[x][y] = null;
    }
}
