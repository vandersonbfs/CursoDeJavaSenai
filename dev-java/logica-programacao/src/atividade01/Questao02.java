package atividade01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        /*
         * 2. Escreva um programa para ler um número e o sistema vai mostra os números
         * vizinhos, o anterior e o próximo número.
         */

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float n1 = ler.nextFloat();

        float anterior = n1 - 1;
        float posterior = n1 + 1;

        System.out.println("Você digitou .................................: " + n1);
        System.out.println("O número anterior a ele é ....................: " + anterior);
        System.out.println("O número posterior a ele é ...................: " + posterior);

        ler.close();

    }
}
