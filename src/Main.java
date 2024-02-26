import Aplicacao.Jogo;
import Dama.PecaDama;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        PecaDama[][] pecas = jogo.getTabuleiro();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (pecas[i][j] != null) {
                    System.out.print("0 ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println(); // Pula para a próxima linha após imprimir uma linha do tabuleiro
        }
    }
}