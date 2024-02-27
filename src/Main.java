import Jogo.Jogo;
import Jogo.UI;
import Tabuleiro.TabuleiroException;

public class Main {
    public static void main(String[] args) {

        try{
            UI ui = new UI();
            Jogo jogo = new Jogo(ui.pegaNomeJogador(), ui.pegaNomeJogador());
            ui.printaTabuleiro(jogo);
        }catch(TabuleiroException e){
            System.out.println(e.getMessage());
        }

    }
}