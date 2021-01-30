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
public class Exe07volumeEsfera {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double raio;
        System.out.println("**VOLUME DA ESFERA**");
        System.out.print("Digite o valor do raio: ");
        raio = entrada.nextDouble();
        System.out.printf("O volume da esfera é: %.2f", volumeEsfera(raio));
        System.out.println();

    }

    static double volumeEsfera(double raio) {
        double volume;
        volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
        return volume;
    }

}
