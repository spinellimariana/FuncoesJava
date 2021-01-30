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
public class Exe02funcaoSomaWhile {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**FUNÇÃO SOMATÓRIA**");
        System.out.print("\nDigite um número inteiro qualquer: ");
        int n = entrada.nextInt();
        System.out.println("\nA soma de todos os inteiros de 1 até " + n + " é igual a: " + somatoria(n) + ".");

    }

    static int somatoria(int a) {
        int soma = 0, controle = 1;

        while (controle <= a) {
            soma = soma + controle;
            controle = controle + 1;
        }
        return soma;
    }
}
