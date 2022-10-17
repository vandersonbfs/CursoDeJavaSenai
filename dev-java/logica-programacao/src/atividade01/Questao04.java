package atividade01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        /*
         * 4. Escreva um programa para ler o nome, valor da hora, quantas horas
         * trabalhadas, o sistema vai apresentar o salário.
         * <fulano> vai receber R$<00.00>
         */

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas:");
        float horas = ler.nextFloat();
        System.out.println("Digite o valor da hora: ");
        float valor = ler.nextFloat();

        ler.close();

        float salario = horas * valor;

        System.out.println("Informações registradas");
        System.out.println("Nome .....................................: " + nome);
        System.out.println("Horas trabalhadas ........................: " + horas);
        System.out.println("Valor por hora ...........................: R$ " + valor);
        System.out.println("Salario a receber ........................: R$ " + salario);

    }

}
