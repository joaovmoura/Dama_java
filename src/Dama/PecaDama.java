package Dama;

public class PecaDama {
    private PosicaoDama posicaoDama;


    public PecaDama(int x, int y){
        this.posicaoDama = new PosicaoDama(x, y);
    }

    public void movimenta(int x, int y){
        this.posicaoDama.setPosicao(x, y);
    }
}
