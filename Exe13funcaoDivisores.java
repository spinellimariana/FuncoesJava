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
public class Exe13funcaoDivisores {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        System.out.println("**FUNÇÃO DIVISORES**");
        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        System.out.println("\nO número " + numero + " tem " + divisores(numero) + " divisores!");

    }

    static int divisores(int numero) {
        int divisor, numDivisores = 0;
        System.out.println("São divisores do número digitado");
        for (int i = 1; i <= numero; i++) {
            divisor = numero % i;
            if (divisor == 0) {
                System.out.print(i + " ");
                numDivisores = numDivisores + 1;
            }
        }
        return numDivisores;
    }

}
