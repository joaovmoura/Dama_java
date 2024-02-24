package tabuleiro;

public class PosicaoTabuleiro {
    private Integer x;
    private Integer y;

    private Boolean ocupada;

    public PosicaoTabuleiro(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        this.ocupada = false;
    }

    public PosicaoTabuleiro(Integer x, Integer y, Boolean ocupada) {
        this.x = x;
        this.y = y;
        this.ocupada = ocupada;
    }
}

