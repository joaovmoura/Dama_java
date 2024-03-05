package Jogador;

import Dama.Cor;

public class Jogador {

    private String name;
    private Integer qtdPecasCapturadas;
    private Cor corDasPecas;

    public Jogador(String name, Cor cor) {
        this.name = name;
        this.qtdPecasCapturadas = 0;
        this.corDasPecas = cor;
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

    public Cor getCorDasPecas() {
        return this.corDasPecas;
    }
}
