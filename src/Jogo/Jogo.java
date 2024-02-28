package Jogo;

import Dama.Cor;
import Dama.PecaDama;
import Dama.PosicaoDama;
import Dama.Tipo;
import Jogador.Jogador;
import Tabuleiro.*;

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

                        this.tabuleiro.addPeca(new PosicaoDama(i, j), Cor.BRANCO);
                        this.tabuleiro.addPeca(new PosicaoDama(7-i, j), Cor.PRETO);
                    }
                }else{
                    if(j%2 == 1){
                        this.tabuleiro.addPeca(new PosicaoDama(i, j), Cor.BRANCO);
                        this.tabuleiro.addPeca(new PosicaoDama(7-i, j), Cor.PRETO);
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

    public void movimentaPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) throws JogoException, TabuleiroException {
        if (!tabuleiro.posicaoOcupada(linhaOrigem-1, colunaOrigem-1))
            throw new JogoException("Não há nenhuma peça nessa posição. ");
        PecaDama pecaOrigem = this.tabuleiro.getPeca(linhaOrigem-1, colunaOrigem-1);
        Cor corOrigem = pecaOrigem.getCor();
        if(tabuleiro.posicaoOcupada(linhaDestino-1, colunaDestino-1)){
            PecaDama pecaDestino = this.tabuleiro.getPeca(linhaDestino-1, colunaDestino-1);
            Cor corDestino = pecaDestino.getCor();
            if (corOrigem == corDestino)
                throw new JogoException("Posição já ocupada por uma pessa sua.");

            Jogador jogador = corOrigem == Cor.BRANCO ? this.jogador1 : this.jogador2;
            capturaPeca(jogador, pecaDestino);
        }



        if(pecaOrigem.getTipo() == Tipo.COMUM && !checaMovimentoComum(pecaOrigem, linhaDestino-1, colunaDestino-1))
            throw new JogoException("Não é possível movimentar a peça para essa posição.");

        this.tabuleiro.removePeca(new PosicaoDama(linhaOrigem-1, colunaOrigem-1));
        this.tabuleiro.addPeca(new PosicaoDama(linhaDestino-1, colunaDestino-1), pecaOrigem.getCor());

    }

    public void capturaPeca(Jogador jogador, PecaDama pecaCapturada){
        jogador.capturaPeca();
        this.tabuleiro.removePeca(pecaCapturada.getPosicao());
    }


    private boolean checaMovimentoComum(PecaDama peca, int linha, int coluna){
        PosicaoDama posicao = peca.getPosicao();

        return  ((peca.getCor() == Cor.BRANCO && linha == posicao.getX() + 1) || (peca.getCor() == Cor.PRETO && linha == posicao.getX()- 1)) &&
                (coluna == posicao.getY() + 1 && coluna < 7 || coluna == posicao.getY() - 1 && posicao.getY() > 1);
    }

    private void viraDama(PecaDama pecaDama){
        pecaDama.viraDama();
    }
}
