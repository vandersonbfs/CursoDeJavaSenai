package atividade01;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        /*
         * 6. Escreva um programa para ler o valor de uma conta e quantas pessoas vão
         * dividir a conta, o sistema vai apresentar quanto cada pessoa vai pagar.
         */

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de uma conta:");
        float valor = ler.nextFloat();
        System.out.println("Digite a quantidade de pessoas:");
        int quantidade = ler.nextInt();

        float vlrPessoa = valor / quantidade;

        System.out.println("Resutaurante Copo sujo");
        System.out.println("Valor consumido ..........................: R$ " + valor);
        System.out.println("Valor por pessoa .........................: R$ " + vlrPessoa);

        ler.close();
    }
}
