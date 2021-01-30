/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ado3exe3funcaoPar {

    public static Scanner entrada = new Scanner(System.in);

    static double numeroPar(int n) {
        int par, impar;
        if (n % 2 == 0) {
            par = n;
            System.out.println("O número digitado é par!");
            return par;
        } else {
            impar = n;
            System.out.println("O número digitado é impar!");
            return impar;
        }

    }

    public static void main(String[] args) {
        System.out.println("**VERIFICADOR DE N�?MERO PAR OU �?MPAR**");
        System.out.print("Digite um número qualquer: ");
        int n = entrada.nextInt();
        numeroPar(n);

    }

}
