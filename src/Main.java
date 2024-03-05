import Jogador.Jogador;
import Jogo.Jogo;
import Jogo.UI;
import Tabuleiro.TabuleiroException;
import Jogo.JogoException;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Jogo jogo = new Jogo(ui.pegaNomeJogador(), ui.pegaNomeJogador());
        int jogadorNum = 1;
        while(true){
            try{
                Jogador jogadorDaVez = jogo.getJogadorPorNum(jogadorNum);
                ui.printaTabuleiro(jogo);
                jogo.movimentaPeca(ui.capturaJogada(), jogadorDaVez);
                System.out.println();
                jogadorNum = (jogadorNum==2) ? 1 : 2;
            }catch(TabuleiroException | JogoException e){
                System.out.println(e.getMessage());
            }
        }
    }
}