package atividade03;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        // 5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai
        // mostrar quantas são maior ou iguais a 18 e quantas são de menor.

        int contar = 0;
        int i = 0;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite a sua idade:");
            int idade = ler.nextInt();

            System.out.println("Sua idade: " + idade);
            i++;
            if (idade == 18) {
                contar++;
                System.out.println("Quantidade de pessoas maiores de 18 anos: " + contar);

            }
        } while (i != 5);
        ler.close();

    }

}
