package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaCollections {

    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<Integer>();

        // Insere 20 números aleatórios
        for(int i = 0; i < 20; i++) {
            listaNumeros.add((int)(Math.random() * 999));
        }

        // Usando 'Collection' para ordenar a lista
        System.out.println("\nUsando 'Collection' para manipular a lista");

        // embaralha a lista
        Collections.shuffle(listaNumeros);
        System.out.println("Lista embaralhada: " + listaNumeros);

        // ordena a lista
        Collections.sort(listaNumeros);
        System.out.println("Lista ordenada: " + listaNumeros);

        // inverte a lista
        Collections.reverse(listaNumeros);
        System.out.println("Lista invertida: " + listaNumeros);
    }
}
