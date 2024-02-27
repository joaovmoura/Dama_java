package Dama;

public class PecaDama {
    private PosicaoDama posicaoDama;
    private Cor cor;

    public PecaDama(int x, int y, Cor cor){
        this.posicaoDama = new PosicaoDama(x, y);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setPosicaoDama(int x, int y){
        this.posicaoDama.setPosicao(x, y);
    }

    public PosicaoDama getPosicao() {
        return this.posicaoDama;
    }
}
