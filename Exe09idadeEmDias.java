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
public class Exe09idadeEmDias {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int anos, meses, dias;
        System.out.println("**IDADE EM DIAS**");
        System.out.println("Digite a sua idade em anos, meses e dias:");
        System.out.print("Anos:");
        anos = entrada.nextInt();
        System.out.print("Meses: ");
        meses = entrada.nextInt();
        System.out.print("Dias:");
        dias = entrada.nextInt();
        System.out.println("Sua idade em dias é: " + converteDias(anos, meses, dias) + "dias.");
    }

    static int converteDias(int anos, int meses, int dias) {
        int a, m, d;
        a = anos * 365;
        m = meses * 30;
        d = dias + a + m;
        return d;
    }

}
