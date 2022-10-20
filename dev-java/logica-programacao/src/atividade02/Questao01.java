package atividade02;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        /*
         * 1. Escreva um programa que leia um número e escreva na tela se o número é
         * menor, igual ou maior que zero
         */
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = ler.nextInt();

        if (n < 0) {
            System.out.println("O número digitado é menor que zero!");
        } else if (n > 0) {
            System.out.println("O número digitado é maior que zero!");
        } else {
            System.out.println("O número digitado é zero!");
        }
        ler.close();
    }
}
