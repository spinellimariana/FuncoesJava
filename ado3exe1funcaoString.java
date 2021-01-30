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
public class ado3exe1funcaoString {

    public static Scanner entrada = new Scanner(System.in);
    //se trocar o nome da variável nota aqui roda do mesmo jeito. Pode ser chamar média, número qualquer coisa.
    static String imprimirNota(double nota) { 
        String frase;
        if (nota >= 6) {
            frase = "APROVADO";
        } else {
            frase = "REPROVADO";
        }
        return frase;
    }

    public static void main(String[] args) {
        System.out.println("Digite a nota do aluno: ");
        double nota = entrada.nextDouble();
        System.out.println("O aluno está: " + imprimirNota(nota));

    }
}
