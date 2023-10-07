package conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjuntos {

    // Set: Conjuntos não tem ordem e não aceitam repetição

    // HashSet: Conjunto não ordenado e não aceita repetição
    // LinkedHashSet: Conjunto ordenado e não aceita repetição
    // TreeSet: Conjunto ordenado e não aceita repetição

    public static void main(String[] args) {

        // Tipagem dinâmica de variáveis
        var valor = 10;

        Set<Integer> setNumeros = new HashSet<>();

        System.out.println("\nAdicionando valores no conjunto");
        System.out.print("10 " + setNumeros.add(10) + ", ");
        System.out.print("22 " + setNumeros.add(22) + ", ");
        System.out.print("33 " + setNumeros.add(33) + ", ");
        System.out.print("22 " + setNumeros.add(22) + ", "); // não aceita repetição
        System.out.println("\n" + setNumeros);

        // Remoção de um elemento
        System.out.println("\nRemovendo um elemento");
        System.out.print("10 " + setNumeros.remove(10) + ", ");
        System.out.print("99 " + setNumeros.remove(99) + ", "); // não existe
        System.out.println("\n" + setNumeros);

        // Tamanho da lista
        System.out.println("\nTamanho do conjunto");
        System.out.println("Tamanho: " + setNumeros.size() + " " + setNumeros);

        // Gerar 50 números aleatórios garantindo que não haja repetidos
        System.out.println("\nGerando 50 números aleatórios");
        Set<Integer> setNumerosAleatorios = new HashSet<>();

        while (setNumerosAleatorios.size() < 50) {
            setNumerosAleatorios.add((int) (Math.random() * 100));
        }

        System.out.println(setNumerosAleatorios);
        System.out.println("Tamanho: " + setNumerosAleatorios.size());

        // Percorrendo a lista com Iterator
        System.out.println("\nPercorrendo a lista com Iterator");
        Iterator<Integer> it = setNumerosAleatorios.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }



        System.out.println("\n\n\n### Set de Clientes ###");
        Set<Cliente> setClientes = new HashSet<>();

        Cliente c1 = new Cliente(1, "João");
        Cliente c2 = new Cliente(2, "Ana");
        Cliente c3 = new Cliente(3, "João");
        Cliente c4 = new Cliente(2, "Pedro");

        System.out.println("\nAdicionando clientes no conjunto:");
        System.out.println(c1 + " " + setClientes.add(c1));
        System.out.println(c2 + " " + setClientes.add(c2));
        System.out.println(c3 + " " + setClientes.add(c3));
        System.out.println(c4 + " " + setClientes.add(c4)); // não aceita repetição (id)

        System.out.println("\nSet de clientes:");
        setClientes.forEach(cliente -> {
            System.out.println(cliente);
        });
    }
}
