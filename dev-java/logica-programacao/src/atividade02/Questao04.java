package atividade02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        /*
         * 4. Escreva um programa que solicita a idade de uma pessoa e verifica se ela
         * pode dirigir (idade>=18).
         */
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int n = ler.nextInt();

        if (n >= 16) {
            System.out.println("Você poderá dirigir!");
        } else {
            System.out.println("Você NÂO poderá dirigir!");
        }
        ler.close();
    }
}
