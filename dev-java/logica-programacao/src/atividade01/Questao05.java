package atividade01;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        /*
         * 5. Escreva um programa para ler o valor de um jantar, o sistema vai
         * apresentar a taxa do garçom 10% e também o valor
         * <valor refeição> + 10% = <final total>.
         */

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de um jantar:");
        float valor = ler.nextFloat();

        float txGarcom = valor / 10;
        float vlrTotal = valor + txGarcom;

        System.out.println("Resutaurante Copo sujo");
        System.out.println("Valor consumido ..........................: R$ " + valor);
        System.out.println("Derviço do garçom ........................: R$ " + txGarcom);
        System.out.println("Total ....................................: R$ " + vlrTotal);

        ler.close();
    }

}
