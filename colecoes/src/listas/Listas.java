package listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        // Lista não tipada
        List lista = new ArrayList();
        lista.add(666);     // int
        lista.add("João");  // String

        // Lista tipada
        List<Integer> listaNumeros = new ArrayList<Integer>();

        // Insere 20 números aleatórios
        for(int i = 0; i < 20; i++) {
            listaNumeros.add((int)(Math.random() * 999));
        }

        // Insere o número 99 na posição 4
        listaNumeros.add(4, 99);

        // For normal
        System.out.print("\nFor normal: ");
        for(int i = 0; i < listaNumeros.size(); i++) {
            System.out.print(listaNumeros.get(i) + " ");
        }

        // For enhanced
        System.out.print("\n\nFor enhanced: ");
        for(Integer i : listaNumeros) {
            System.out.print(i + " ");
        }

        // Stream forEach
        System.out.print("\n\nStream forEach: ");
        listaNumeros.forEach((i) -> {
            System.out.print(i + " ");
        });

        // Stream Parallel
        System.out.println("\n\nStream Parallel: ");
        listaNumeros.stream().parallel().forEach((i) -> {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        });



        // Soma de todos os números múltiplos de 5
        System.out.println("\nSoma dos múltiplos de 5");

        // Usando for normal
        int soma = 0;
        for(Integer i : listaNumeros) {
            if(i % 5 == 0) {
                soma += i;
            }
        }
        System.out.println("Usando for normal: " + soma);

        // Usando for enhanced
        soma = 0;
        for(Integer i : listaNumeros) {
            if(i % 5 == 0) {
                soma += i;
            }
        }
        System.out.println("Usando for enhanced: " + soma);

        // Usando stream
        soma = listaNumeros
                .stream()
                .filter(n -> n % 5 == 0)
                .mapToInt((n) -> n)
                .sum();
        System.out.println("Usando stream: " + soma);
    }
}
