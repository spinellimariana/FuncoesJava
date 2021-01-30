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
public class Exe11notaConceito {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double media;
        System.out.println("**CONVERTENDO NOTAS EM CONCEITOS**");
        do {
            System.out.println("Informe a media final do aluno: ");
            media = entrada.nextDouble();
            if (media < 0 && media > 10) {
                System.out.println("A nota digitada é inválida!");
            }
        }while(media < 0 || media > 10); 
        System.out.println("A nota digitada equivale ao conceito: " + notaConceito(media));
    }

    static char notaConceito(double nota) {
        char conceito = 'x'; //aqui pede para inicializar a variável no exercício 10 não pede?
        if (nota >= 0.0 && nota <= 4.9) {
            conceito = 'D';
        } else if (nota >= 5.0 && nota <= 6.9) {
            conceito = 'C';
        } else if (nota >= 7.0 && nota <= 8.9) {
            conceito = 'B';
        } else if (nota >= 9.0 && nota <= 10.0) {
            conceito = 'A';
        } 
        return conceito;
    }

}
