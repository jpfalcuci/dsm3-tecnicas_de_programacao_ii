package listas;

import java.util.LinkedList;
import java.util.List;

public class ListaEncadeada {

    // Listas encadeadas são mais rápidas para inserção e remoção de elementos em posições intermediárias,
    // mas são mais lentas para acessar elementos em posições intermediárias.

    public static void main(String[] args) {

        List<Integer> listaEncadeada = new LinkedList<Integer>();

        ((LinkedList<Integer>) listaEncadeada).addFirst(1);
        ((LinkedList<Integer>) listaEncadeada).addLast(2);
        ((LinkedList<Integer>) listaEncadeada).addLast(3);
        ((LinkedList<Integer>) listaEncadeada).addLast(4);

        // por posição
        System.out.println("For por posição:");
        for(int i = 0; i < listaEncadeada.size(); i++) {
            System.out.print(listaEncadeada.get(i) + " ");
        }

        // for enhanced
        System.out.println("\nFor enhanced:");
        for(Integer i : listaEncadeada) {
            System.out.print(i + " ");
        }

        // stream forEach
        System.out.println("\nStream forEach:");
        listaEncadeada.forEach((i) -> {
            System.out.print(i + " ");
        });
    }
}
