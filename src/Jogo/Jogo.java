package Jogo;

import Dama.Cor;
import Dama.PecaDama;
import Dama.PosicaoDama;
import Dama.Tipo;
import Jogador.Jogador;
import Tabuleiro.*;

import java.awt.*;

public class Jogo {


    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo(String j1Nome, String j2Nome) {
        this.tabuleiro = new Tabuleiro(8, 8);
        this.jogador1 = new Jogador(j1Nome, Cor.BRANCO);
        this.jogador2 = new Jogador(j2Nome, Cor.PRETO);
        this.povoaTabuleiro();
    }


    private void povoaTabuleiro(){
        for(int i = 0; i < 3; i++)
            for(int j = 0; j<8; j++)
                if(i%2==0){
                    if(j%2 == 0)
                        this.tabuleiro.addPeca(new PosicaoDama(i, j), Cor.BRANCO);
                    else
                        this.tabuleiro.addPeca(new PosicaoDama(7-i, j), Cor.PRETO);
                }else{
                    if(j%2 == 1)
                        this.tabuleiro.addPeca(new PosicaoDama(i, j), Cor.BRANCO);
                    else
                        this.tabuleiro.addPeca(new PosicaoDama(7-i, j), Cor.PRETO);

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

    public Jogador getJogadorPorNum (int num){
        return (num==1) ? this.jogador1 : this.jogador2;
    }

    public void movimentaPeca(Integer[] jogada, Jogador jogador) throws JogoException, TabuleiroException {
        if (!tabuleiro.posicaoOcupada(jogada[0], jogada[1]))
            throw new JogoException("Não há nenhuma peça nessa posição.");
        PecaDama pecaOrigem = this.tabuleiro.getPeca(jogada[0], jogada[1]);

        if (pecaOrigem.getCor() != jogador.getCorDasPecas())
            throw new JogoException("A peça na posição de origem não é sua.");

        if(pecaOrigem.getTipo() == Tipo.COMUM && !checaMovimentoComum(pecaOrigem, jogada[2], jogada[3], jogador))
            throw new JogoException("Não é possível movimentar a peça para essa posição.");

        this.tabuleiro.removePeca(new PosicaoDama(jogada[0], jogada[1]));
        this.tabuleiro.addPeca(new PosicaoDama(jogada[2], jogada[3]), pecaOrigem.getCor());

    }

    public void capturaPeca(Jogador jogador, PecaDama pecaCapturada) {
        jogador.capturaPeca();
        this.tabuleiro.removePeca(pecaCapturada.getPosicao());
    }


    private boolean checaMovimentoComum(PecaDama peca, int linha, int coluna, Jogador jogadorDaVez) throws JogoException {
        PosicaoDama posicao = peca.getPosicao();
        Cor corOrigem = peca.getCor();
        if(tabuleiro.posicaoOcupada(linha, coluna)) {
            PecaDama pecaDestino = this.tabuleiro.getPeca(linha, coluna);
            Cor corDestino = pecaDestino.getCor();
            if (corOrigem == corDestino)
                throw new JogoException("Posição já ocupada por uma peça sua.");
        }

        int linhaAdversario = (posicao.getX() + linha) / 2;
        int colunaAdversario = (posicao.getY() + coluna) / 2;
        PecaDama pecaAdversario = this.tabuleiro.getPeca(linhaAdversario, colunaAdversario);
        if(pecaAdversario != null){
            capturaPeca(jogadorDaVez, pecaAdversario);
            return true;
        }

        return  ((peca.getCor() == Cor.BRANCO && linha == posicao.getX() + 1) || (peca.getCor() == Cor.PRETO && linha == posicao.getX()- 1)) &&
                (coluna == posicao.getY() + 1 && coluna <= 7 || coluna == posicao.getY() - 1 && posicao.getY() >= 0);
    }

    private void viraDama(PecaDama pecaDama){
        pecaDama.viraDama();
    }
}
