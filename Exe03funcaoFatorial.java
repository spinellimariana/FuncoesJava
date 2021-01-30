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
public class Exe03funcaoFatorial {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n1;
        System.out.println("**FUNÇÃO FATORIAL**");
        do {
            System.out.print("\nDigite um número inteiro maior que zero: ");
            n1 = entrada.nextInt();
            if (n1 <= 0) {
                System.err.println("Opção inválida!");
            }
        } while (n1 <= 0);

        System.out.println("\nO fatorial de " + n1 + " é: " + fatorial(n1) + ".");
    }

    static int fatorial(int n1) {
        int fatorial = 1;
        System.out.print("\nOs números da sequencia fatorial são: ");
        for (int i = 1; i <= n1; i++) {
            fatorial = fatorial * i;
            System.out.print(i + " ");

        }
        return fatorial;
    }
}
