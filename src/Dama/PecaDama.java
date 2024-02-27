package Dama;

public class PecaDama {
    private PosicaoDama posicaoDama;
    private Cor cor;

    private Tipo tipo;

    public PecaDama(int x, int y, Cor cor){
        this.posicaoDama = new PosicaoDama(x, y);
        this.cor = cor;
        this.tipo = Tipo.COMUM;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void viraDama(){
        this.tipo = Tipo.DAMA;
    }
}
