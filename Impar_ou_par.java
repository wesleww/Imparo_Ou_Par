/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impar_ou_par;

import java.util.Scanner;
import java.util.Random;

public class Impar_ou_par {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ganhou = 0;
        int perdeu = 0;
        for (int i = 0; i < 3; i++) {
            if (ganhou == 2 || perdeu == 2) {
                i++;
            } else {

                System.out.println("rodada" + (i + 1));
                System.out.println("Digite (I) para impar e (P) para par");
                char imparPar = leia.next().toUpperCase().charAt(0);
                while (imparPar != 'I' && imparPar != 'P') {
                    System.out.println("comando invalido, tente novamente");
                    System.out.println("Digite (I) para impar e (P) para par");
                    imparPar = leia.next().toUpperCase().charAt(0);

                }
                System.out.println("Digite um numero : ");
                int n = leia.nextInt();
                Random numeroAleatorio = new Random();
                int resposta = numeroAleatorio.nextInt(30) + n;
                System.out.println("-----Rodada-----");
                System.out.println("Seu número : " + n);
                System.out.println("Número do adversario : " + (resposta - n));
                System.out.println("Número final :" + resposta);
                if (imparPar == 'I') {
                    System.out.println("Sua resposta foi : IMPAR");
                } else {
                    System.out.println("Sua resposta foi : PAR");
                }
                if (resposta % 2 == 0) {
                    System.out.println("O número final: PAR");
                } else {
                    System.out.println("O número final : IMPAR");
                }
                if (imparPar == 'P' && resposta % 2 != 0) {
                    System.out.println("Voce ganhou essa rodada ");
                    ganhou++;
                }
                if (imparPar == 'I' && resposta % 2 != 0) {
                    System.out.println("Voce ganhou essa rodada ");
                    ganhou++;
                } else {
                    System.out.println("voce perdeu a rodada");
                    perdeu++;
                }
                System.out.println("----INFO----");
                System.out.println("Seus Pontos :" + ganhou);
                System.out.println("Pontos do adversario : " + perdeu);
                System.out.println("Rodada : " + (i + 1));
                System.out.println("----INFO----");
                System.out.println("-------Rodada------");

            }
            System.out.println("-----Resultado Final-----");
            if (ganhou > perdeu) {
                System.out.println("voce ganhou");
            } else if (ganhou < perdeu) {
                System.out.println("O Adversario ganhou");
            } else {
                System.out.println("Ninguem ganhou o jogo");
            }
        }
        System.out.println("-----Resultado Final-----");
    }

}