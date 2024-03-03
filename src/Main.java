import Jogo.Jogo;
import Jogo.UI;
import Tabuleiro.TabuleiroException;
import Jogo.JogoException;

public class Main {
    public static void main(String[] args) {

        try{
            UI ui = new UI();
            Jogo jogo = new Jogo(ui.pegaNomeJogador(), ui.pegaNomeJogador());
            while(true){
                ui.printaTabuleiro(jogo);
                jogo.movimentaPeca(ui.capturaJogada());
                System.out.println();
            }
        }catch(TabuleiroException | JogoException e){
            System.out.println(e.getMessage());
        }
    }
}