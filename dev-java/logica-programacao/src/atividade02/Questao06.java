package atividade02;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        /*
         * 6. Escreva um programa para calcular O IMC (índice de massa corpórea) que
         * indica o grau de obesidade de uma pessoa.
         * Este índice é obtido pelo peso (em kg) dividido pelo quadrado da altura (em
         * metros).
         * Entradas peso e altura, saída resultado do IMC e Avaliação.
         * A tabela a seguir apresenta as faixas deste índice:
         * IMC = Avaliação
         * menor que 20 = Abaixo do normal
         * entre 20, 25 = Normal imc
         * entre 25, 30 = Sobrepeso
         * entre 30, 35 = Obesidade leve
         * entre 35, 40 = Obesidade moderada
         * maior que 40 = Obesidade mórbida
         */

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = ler.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = ler.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é " + imc);

        if (imc < 20) {
            System.out.println("Abaixo do normal.");
        } else if (imc > 20 && imc <= 25) {
            System.out.println("Normal imc.");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Sobrepeso.");
        } else if (imc > 30 && imc <= 35) {
            System.out.println("Obesidade leve.");
        } else if (imc > 35 && imc <= 40) {
            System.out.println("Obesidade moderada.");
        } else if (imc > 40) {
            System.out.println("Obesidade mórbida.");
        }

        ler.close();
    }

}
