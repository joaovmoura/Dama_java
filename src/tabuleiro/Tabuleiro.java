package tabuleiro;
import Dama.*;
public class Tabuleiro {

    private PecaDama[][] pecas;
    private Integer colunas;
    private Integer linhas;


    public Tabuleiro(int colunas, int linhas) {
        this.colunas = colunas;
        this.linhas = linhas;
        this.pecas = PecaDama[linhas][colunas];
    }

    public PecaDama getPeca(int linha, int coluna){
        if (pecas[linha][coluna] == null)
            throw new TabuleiroException("Nenhuma peça nessa posição!");
        return pecas[linha][coluna];
    }
}
