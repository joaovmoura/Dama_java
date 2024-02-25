package Dama;

public class PecaDama {

    private PosicaoDama posicaoDama;


    PecaDama(int x, int y){
        this.posicaoDama = new PosicaoDama(x, y);
    }

    public void movimenta(int x, int y){
        this.posX = x;
        this.posY = y;
    }

}
