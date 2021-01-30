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
public class Exe14aN {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int a, n, auxiliar;
        System.out.print("Digite o valor de A:");
        a = entrada.nextInt();
        System.out.print("Digite o valor de N:");
        n = entrada.nextInt();
        auxiliar = soma(a, n);

        if (auxiliar == -1) {
            System.out.println("Retorno igual a " + auxiliar + ": o número digitado é negativo ou zero.");
        } else if (auxiliar != -1) {
            System.out.println("A soma dos " + n + " números em sequência a partir de " + a + " é = " + auxiliar);
        }
    }

    static int soma(int a, int n) {
        int soma = 0;
        if (n == -1 || n == 0) {
            soma = -1;
        } else {
            for (int i = 1; i <= n; i++) {
                soma = soma + a;
                a++;
            }
        }
        return soma;
    }
}
