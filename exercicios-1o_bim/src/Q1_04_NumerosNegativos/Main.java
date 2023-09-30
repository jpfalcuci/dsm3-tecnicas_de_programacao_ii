package Q1_04_NumerosNegativos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Crie um programa que receba um número inteiro n e leia n valores do teclado
 * e compute quantos destes valores são negativos.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+---------------------------------------+");
        System.out.println("|           NÚMEROS NEGATIVOS           |");
        System.out.println("+---------------------------------------+");

        Scanner input = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        int quantidadeNumeros ;
        int contador = 0;

        do {
            System.out.print("Informe a quantidade de números (> 0): ");
            quantidadeNumeros = input.nextInt();
        } while (quantidadeNumeros <= 0);

        for (int x = 1; x <= quantidadeNumeros; x++) {
            System.out.print("Informe o número " + x + "/" + quantidadeNumeros + ": ");
            int valor = input.nextInt();
            listaNumeros.add(valor);

            if (valor < 0) {
                contador++;
            }
        }

        input.close();

        System.out.println("Números digitados: " + listaNumeros);
        System.out.println("Quantidade de números negativos: " + contador);
        System.out.println("-----------------------------------------");
    }
}
