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
public class ado3exe4funcaoCalculo {

    public static Scanner entrada = new Scanner(System.in);

    static double calculo(double x) {
        double resultado = 0;
        System.out.println("***C�?LCULO***");
        if (x < -1) {
            resultado = x + 2;
            System.out.println("f(x) = x + 2");
           
        } else if (x >= -1 && x <= 2) {
            resultado = (x * x) - 4;
            System.out.println("f(x) = x² - 4");
            
        } else if (x > 2) {
            resultado = (2 * x) - 1;
            System.out.println("f(x) = 2x - 1");
            
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.print("Digite o valor de X: ");
        double num = entrada.nextDouble();
        System.out.println("O resultado da função é: " + calculo(num));
    }

}
