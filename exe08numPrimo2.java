/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class exe08numPrimo2 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        String verifica;
        System.out.println("***VERIFICADOR DE NÚMERO PRIMO***");
        do {
            System.out.print("\nDigite um número inteiro positivo: ");
            numero = entrada.nextInt();
        } while (numero <= 0);
        
        primo(numero);

    }

    static void primo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        System.out.print("\nO número digitado: ");
        if (contador == 2) {
            System.out.println("É PRIMO!");
        } else {
            System.out.println("NÃO É PRIMO!");
        }
    }

}
