package Dama;
import tabuleiro.PosicaoTabuleiro;
public class PosicaoDama {

    private PosicaoTabuleiro posicaoTabuleiro;

    public PosicaoDama(int x, int y) {
        this.posicaoTabuleiro = new PosicaoTabuleiro(x, y, true);
    }
}
