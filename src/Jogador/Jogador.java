package Jogador;

public class Jogador {

    private String name;
    private Integer qtdPecasCapturadas;

    public Jogador(String name) {
        this.name = name;
        this.qtdPecasCapturadas = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getQtdPecasCapturadas() {
        return qtdPecasCapturadas;
    }

    public void capturaPeca() {
        this.qtdPecasCapturadas++;
    }
}
