package Dama;


public class PosicaoDama {

    private Integer x;
    private Integer y;

    public PosicaoDama(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public void setPosicao(int x, int y){
        this.x =x;
        this.y = y;
    }
    public Integer getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
