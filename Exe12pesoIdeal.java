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
public class Exe12pesoIdeal {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double alt, gen;

        System.out.println("Digite sua altura em metros: ");
        alt = entrada.nextDouble();
        System.out.println("Informe se homem ou mulher:");
        do {
            System.out.println("1 - Homem;");
            System.out.println("2 - Mulher.");
            gen = entrada.nextDouble();
            if (gen != 1 && gen != 2) {
                System.out.println("Opção inválida!");
            }
        } while (gen != 1 && gen != 2);
        
        System.out.printf("O seu peso ideal é: %.2f\n", pesoIdeal(alt, gen));
    }

    static double pesoIdeal(double altura, double genero) {
        double peso = 0;
        if (genero == 1) {
            peso = (72.7 * altura) - 58;
        } else if (genero == 2) {
            peso = (62.1 * altura) - 44.7;
        }
        return peso;
    }

}
