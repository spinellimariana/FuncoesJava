/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista3;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Exe10categoria {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int idade;
        System.out.println("**CATEGORIAS DA NATAÇÃO**");
        do {
            System.out.println("Informe a idade do nadador: ");
            idade = entrada.nextInt();
            if (idade < 5) {
                System.out.println("A idade digitada não comporta categoria!");
            }
        } while (idade < 5);
        
        System.out.println("A idade do nadador corresponde à categoria: " + categoriaNadador(idade));
    }

    static String categoriaNadador(int idade) {
        String categoria; //aqui NÃO PEDE para inicializar a variável no exercício 11 pede
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else {
            categoria = "Adulto";
        }
        return categoria;
    }

}
