package atividade03;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        // 4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de
        // "Java-2022" o retorno vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa
        // pode faze no máximo 5 tentativas de acertar a palavra.

        int contar = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma mensagem");
        String men = ler.nextLine();
        String senha = "Java-2022";

        do {

            if (men.equals(senha)) {

                System.out.println("Palavra Ok");
                contar = 5;

            } else {
                contar++;

                System.out.println("Palavra Errada");
                men = ler.nextLine();
            }

        } while (contar != 5);
        ler.close();
    }
}
