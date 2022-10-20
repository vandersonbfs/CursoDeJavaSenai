package atividade02;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        /*
         * 5. Escreva um programa que dada a idade de uma pessoa, retorna uma das
         * seguintes mensagens: “Não pode nem votar e nem dirigir”,
         * “Pode votar, mas não pode dirigir”, “Pode votar e pode dirigir”.
         */

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int n = ler.nextInt();

        if (n >= 16 && n < 18) {
            System.out.println("Você poderá votar! Mas você NÂO poderá dirigir!");
        }
        if (n >= 16 && n >= 18) {
            System.out.println("Você poderá votar e dirigir!");
        } else {
            System.out.println("Você não tem idade minima nem para votar nem para dirigir!");
        }
        ler.close();
    }

}
