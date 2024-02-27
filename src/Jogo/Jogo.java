package Jogo;

import Dama.Cor;
import Jogador.Jogador;
import Tabuleiro.Tabuleiro;

public class Jogo {


    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo(String j1Nome, String j2Nome) {
        this.tabuleiro = new Tabuleiro(8, 8);
        this.jogador1 = new Jogador(j1Nome);
        this.jogador2 = new Jogador(j2Nome);
        this.povoaTabuleiro();
    }


    private void povoaTabuleiro(){
        for(int i = 0; i < 3; i++)
            for(int j = 0; j<8; j++)
                if(i%2==0){
                    if(j%2 == 0){
                        this.tabuleiro.addPeca(i, j, Cor.BRANCO);
                        this.tabuleiro.addPeca(7-i, j, Cor.PRETO);
                    }
                }else{
                    if(j%2 == 1){
                        this.tabuleiro.addPeca(i, j, Cor.BRANCO);
                        this.tabuleiro.addPeca(7-i, j, Cor.PRETO);
                    }
                }
    }


    public Tabuleiro getTabuleiro() {
        return this.tabuleiro;
    }

    public String getJogador1() {
        return jogador1.getName();
    }

    public String getJogador2() {
        return jogador2.getName();
    }

    public void movimentaPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) throws JogoException{
        if (!tabuleiro.posicaoOcupada(linhaOrigem, colunaOrigem))
            throw new JogoException("Não há nenhuma peça nessa posição. ");
        if(!tabuleiro.posicaoOcupada(linhaDestino, colunaDestino))
            throw new JogoException("A posição de destino já está ocupada.");

    }
}
