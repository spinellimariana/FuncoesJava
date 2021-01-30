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
public class Exe15funcaoExpoente {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double x;
        int z;

        System.out.print("Digite o valor de X: ");
        x = entrada.nextDouble();
        System.out.print("Digite o valor de Z: ");
        z = entrada.nextInt();
        System.out.println("O número " + x + " elevado a " + z + " é igual a " + expoente(x, z));
    }
  /*Não consigo digitar valor quebrado no valor de Z porque o contador i do laço 'for' não chega no número
    quebrado. Então sempre que o número Z fosse quebrado, o resultado da exponenciação dá errado*/

    static double expoente(double x, double z) {
        double expoente = 1;
        for (int i = 1; i <= z; i++) {
            expoente *= x;
        }
        return expoente;
    }

}
