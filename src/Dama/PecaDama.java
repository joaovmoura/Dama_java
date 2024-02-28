package Dama;

public class PecaDama {
    private PosicaoDama posicaoDama;
    private Cor cor;

    private Tipo tipo;

    public PecaDama(PosicaoDama posicao, Cor cor){
        this.posicaoDama = posicao;
        this.cor = cor;
        this.tipo = Tipo.COMUM;
    }

    public Cor getCor() {
        return cor;
    }

    public void setPosicaoDama(PosicaoDama posicaoDama){
        this.posicaoDama = posicaoDama;
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
