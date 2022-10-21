package atividade03;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        // 2. Escreva um programa que vai ler uma mensagem e um número, o sistema vai
        // repetir a mensagem digitada x vezes o número digitado.
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma mensagem");
        String men = ler.nextLine();
        System.out.println("Digite um número:");
        int n = ler.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println(men);
        }

    }
}
