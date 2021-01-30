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
public class ado3exe2funcaoMaior {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double n1 = entradaDados();
        double n2 = entradaDados();
        maiorNumero(n1, n2);

    }

    static double entradaDados() {
        System.out.println("**ENTRADA DE DADOS**");
        System.out.print("Digite um número qualquer: ");
        double num = entrada.nextDouble();
        return num;
    }

    static double maiorNumero(double a, double b) {
        double max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("O maior número digitado é: " + max);
        return max;
    }
}
