package atividade03;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        // 6. Escreva um programa que vai ler 5 números o sistema vai mostrar o maior o
        // menor a soma e a média dos números digitados.

        int i = 0;
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0;
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int media = 0;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite um número:");
            int n = ler.nextInt();

            i++;

            if (i == 1) {
                i1 = n;
            } else if (i == 2) {
                i2 = n;
            } else if (i == 3) {
                i3 = n;
            } else if (i == 4) {
                i4 = n;
            } else if (i == 5) {
                i5 = n;
            }
            if (i1 > i2 && i1 > i3 && i1 > i4 && i1 > i5) {
                maior = i1;
            } else if (i2 > i1 && i2 > i3 && i2 > i4 && i2 > i5) {
                maior = i2;
            } else if (i3 > i1 && i3 > i2 && i3 > i4 && i3 > i5) {
                maior = i3;
            } else if (i4 > i2 && i4 > i3 && i4 > i1 && i4 > i5) {
                maior = i4;
            } else if (i5 > i2 && i5 > i3 && i5 > i4 && i5 > i1) {
                maior = i5;
            }

            if (i1 < i2 && i1 < i3 && i1 < i4 && i1 < i5) {
                menor = i1;
            } else if (i2 < i1 && i2 < i3 && i2 < i4 && i2 < i5) {
                menor = i2;
            } else if (i3 < i2 && i3 < i1 && i3 < i4 && i3 < i5) {
                menor = i3;
            } else if (i4 < i2 && i4 < i3 && i4 < i1 && i4 < i5) {
                menor = i4;
            } else if (i5 < i2 && i5 < i3 && i5 < i4 && i5 < i1) {
                menor = i5;
            }
            soma = i1 + i2 + i3 + i4 + i5;

            media = soma / 5;

            if (i == 5) {
                System.out.println(" ");
                System.out.println("O maior ...............................: " + maior);
                System.out.println("O menor ...............................: " + menor);
                System.out.println("A soma  ...............................: " + soma);
                System.out.println("A média ...............................: " + media);
            }

        } while (i != 5);
        ler.close();

    }

}
