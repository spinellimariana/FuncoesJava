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
public class Exe01funcaoMenorNum {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**FUNÇÃO DO MENOR NÚMERO**");
        System.out.print("Digite o valor de n1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o valor de n2: ");
        double n2 = entrada.nextDouble();
        System.out.print("Digite o valor de n3: ");
        double n3 = entrada.nextDouble();
        System.out.println("O menor número digitado é: " + menorNumero(n1, n2, n3));

    }

    static double menorNumero(double a, double b, double c) {
        double min;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }

}
