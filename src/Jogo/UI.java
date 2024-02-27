package Jogo;

import Dama.Cor;
import Dama.PecaDama;
import Tabuleiro.*;

import java.util.Scanner;

public class UI {


    public void printaTabuleiro (Jogo jogo) throws TabuleiroException {

        System.out.println();
        System.out.println("Jogador 1: " + jogo.getJogador1());
        System.out.println("Jogador 2: " + jogo.getJogador2());
        System.out.println();


        Tabuleiro tabuleiro = jogo.getTabuleiro();
        PecaDama[][] pecas = tabuleiro.getPecas();

        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 8; j++) {

                if (pecas[i][j] != null) {
                    Cor corDaPeca = tabuleiro.getPeca(i, j).getCor();
                    String corCodigo = (corDaPeca == Cor.BRANCO) ? "\u001B[37m" : "\u001B[30m";

                    System.out.print(corCodigo + "0\u001B[0m ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println("  1 2 3 4 5 6 7 8");
    }

    public String pegaNomeJogador (){
        System.out.print("Nome do jogador: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
