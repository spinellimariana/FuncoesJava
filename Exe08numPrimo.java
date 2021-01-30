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
public class Exe08numPrimo {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        System.out.println("***VERIFICADOR DE NÚMERO PRIMO***");
        do {
            System.out.print("\nDigite um número inteiro positivo: ");
            numero = entrada.nextInt();
        } while (numero <= 0);

        boolean resultado = primo(numero);

        if (resultado == true) {
            System.out.println("NÚMERO PRIMO!");
        } else {
            System.out.println("O número não é primo!");
        }
    }
    static boolean primo(int numero) {
        boolean numPrimo = false;
        if (numero == 2) {          //o número 2 tive que colocar na unha.
            numPrimo = true;        //não passa pelo teste.
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                numPrimo = false;
                break;
            } else {
                numPrimo = true;
            }
        }
        return numPrimo;
    }
}
