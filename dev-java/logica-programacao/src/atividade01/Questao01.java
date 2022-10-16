package atividade01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        /*
         * 1. Escreva um programa para ler 2 notas, o sistema vai apresentar a média
         * final,
         * se nota maior que 7 incluir mensagem "aprovado" senão "reprovado".
         */
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = ler.nextFloat();

        float media = (n1 + n2) / 2;

        System.out.println("A média é: " + media);

        if (media > 7) {
            System.out.println("Você foi Aprovado!");
        } else {
            System.out.println("Você foi Reprovado!");
        }

        ler.close();

    }
}
