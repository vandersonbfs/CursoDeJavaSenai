package atividade03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        // 3. Escreva um programa que vai ler 2 números, o sistema vai escrever na tela
        // todos os número entre os 2 digitados.

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = ler.nextInt();

        System.out.println("Digite outro número:");
        int n1 = ler.nextInt();
        System.out.println("+-----------------------------------+");
        int maior = 0;
        int menor = 0;

        if (n > n1) {
            maior = n;
            menor = n1;
        } else {
            maior = n1;
            menor = n;
        }
        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }
        System.out.println("+-----------------------------------+");

    }
}
