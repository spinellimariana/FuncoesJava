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
public class Exe05bhaskara1 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
        boolean controle = false;
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
        System.out.println("A maior raíz da equação é: " + bhaskara(a, b, c));

    }

    static double bhaskara(double a, double b, double c) {
        double delta, retorno, x1, x2;
        delta = Math.pow(b, 2) - 4 * a * c;

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
        return retorno;
    }
}
