package atividade02;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        /*
         * 3. Escreva um programa que solicita a idade de uma pessoa e verifica se ela
         * pode votar (idade>=16).
         */

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int n = ler.nextInt();

        if (n >= 16) {
            System.out.println("Você poderá votar!");
        } else {
            System.out.println("Você NÂO poderá votar!");
        }
        ler.close();

    }
}
