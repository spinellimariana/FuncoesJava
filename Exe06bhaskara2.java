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
public class Exe06bhaskara2 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c, d, raiz;
        boolean controle = false, controle2 = false;
        
        System.out.println("**RESOLVENDO BHASKARA**");
        do {
            System.out.print("Digite o valor de A: ");
            a = entrada.nextDouble();
            if (a == 0) {
                System.out.println("Opção inválida. Para uma equação de 2o grau existir o valor de 'a' "
                        + "não pode ser zero!");
            } else {
                controle = true;
            }
        } while (controle == false);

        System.out.print("Digite o valor de B: ");
        b = entrada.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = entrada.nextDouble();

        do {
            System.out.println("\nEscolha:");
            System.out.println("1 - para obter a MAIOR raíz;");
            System.out.println("2 - para obter a MENOR raíz;");
            d = entrada.nextDouble();
            if (d == 1 || d == 2) {
                controle2 = true;
            } else {
                System.out.println("Opção inválida!");
            }
        } while (controle2 == false);

        raiz = bhaskara(a, b, c, d);

        if (d == 1) {
            System.out.println("A MAIOR raíz da equação é: " + raiz);
        } else if (d == 2) {
            System.out.println("A MENOR raíz da equação é: " + raiz);
        }
    }

    static double bhaskara(double a, double b, double c, double d) {
        double delta, retorno = 0, x1, x2;
        delta = Math.pow(b, 2) - 4 * a * c;

        if (d == 1) {  //PARA MAIOR RAIZ
            if (delta < 0) {
                System.out.println("Delta negativo, não existem raízes reais!");
                retorno = -1;
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                if (x1 >= x2) {
                    retorno = x1;
                } else {
                    retorno = x2;
                }
            }
        } else if (d == 2) {  //PARA MENOR RAIZ
            if (delta < 0) {
                System.out.println("Delta negativo, não existem raízes reais!");
                retorno = -1;
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                if (x1 <= x2) {
                    retorno = x1;
                } else {
                    retorno = x2;
                }
            }
        }
        return retorno;
    }
}
