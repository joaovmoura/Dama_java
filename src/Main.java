import Aplicacao.Jogo;
import Aplicacao.UI;
import Dama.PecaDama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UI ui = new UI();
        Jogo jogo = new Jogo(ui.pegaNomeJogador(), ui.pegaNomeJogador());
        ui.printaTabuleiro(jogo);

    }
}