package atividade02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        /*
         * 2. Escreva um programa que receba três inteiros e diga qual deles é o maior e
         * qual o menor.
         */
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = ler.nextInt();
        System.out.println("Digite outro número:");
        int n1 = ler.nextInt();
        System.out.println("Digite outro número:");
        int n2 = ler.nextInt();

        if (n > n2 && n > n1) {

            System.out.println("O maior número é: " + n);

        } else if (n1 > n && n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else {
            System.out.println("O maior número é: " + n2);
        }

        ler.close();
    }
}
