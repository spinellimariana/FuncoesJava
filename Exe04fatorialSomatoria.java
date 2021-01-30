/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exe04fatorialSomatoria {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n1; 
        System.out.println("**FUNÇÃO DIVISÃO DO FATORIAL PELA SOMATÓRIA**");
        do {
            System.out.print("\nDigite um número inteiro maior que zero: ");
            n1 = entrada.nextInt();
            if (n1 <= 0) {
                System.err.println("Opção inválida!");
            }
        } while (n1 <= 0);
        System.out.println("\nO resultado da divisão do fatorial pela somatória é: " + divisao(fatorial(n1), somatoria(n1)));

    }

    static double fatorial(int n1) {
        double fatorial = 1;
        System.out.print("\nOs números da sequencia fatorial são: ");
        for (int i = 1; i <= n1; i++) {
            fatorial = fatorial * i;

            System.out.print(i + " ");
        }
        System.out.println("\n\nO fatorial de " + n1 + " é: " + fatorial + ".");
        return fatorial;
    }

    static double somatoria(int n1) {
        int controle = 1;
        double soma = 0;

        while (controle <= n1) {
            soma = soma + controle;
            controle = controle + 1;
        }
        System.out.println("\nA soma de todos os inteiros de 1 até " + n1 + " é igual a: " + soma + ".");
        return soma;
    }

    static double divisao(double fatorial, double soma) {
        double resultado = fatorial / soma;
        return resultado;
    }

}
