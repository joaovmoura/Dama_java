package Aplicacao;

import Dama.PecaDama;

import java.util.Scanner;

public class UI {


    public void printaTabuleiro (Jogo jogo){

        System.out.println();
        System.out.println("Jogador 1: " + jogo.getJogador1());
        System.out.println("Jogador 2: " + jogo.getJogador2());
        System.out.println();

        PecaDama[][] pecas = jogo.getTabuleiro();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (pecas[i][j] != null) {
                    System.out.print("0 ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public String pegaNomeJogador (){
        System.out.print("Nome do jogador: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
