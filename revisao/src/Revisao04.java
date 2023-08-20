import java.util.ArrayList;
import java.util.List;

public class Revisao04 {

    public static void main(String[] args) {

        // Fluxo de controle
        System.out.println("Fluxo de controle:");
        for (int i = 0; i < 10; i++) { // Iteração de 0 a 9
            if (i %2 == 0) { // Não imprime os números pares
                continue; // Interrompe a execução do laço e vai para a próxima iteração
            }
            System.out.print(i + " ");
        }

        // Instruções rotuladas
        System.out.print("\nFluxo de controle com instruções rotuladas:");
        primeiroFor: // Rotulando o primeiro laço (também pode ser usado com if, while, etc)
        for (int k = 0; k < 2; k++) {
            System.out.print("\n" + (k + 1) + "ª iteração: ");

            segundoFor: // Rotulando o segundo laço
            for (int i = 0; i < 20; i++) { // Iteração de 0 a 19
                if (i > 10) { // Só deve imprimir até 10
                    continue primeiroFor;
                    // Interrompe a execução do "segundoFor" e vai para a próxima iteração do "primeiroFor"
                }
                System.out.print(i + " ");
            }
        }


        // Tipagem de listas

        // Tipo "List" é uma interface, não pode ser instanciado
        // Aceita vários tipos de listas

        List<Object> listaGeral = new ArrayList<>(); // Aceita qualquer objeto
        listaGeral.add("joão");
        listaGeral.add(22);
        listaGeral.add(10.5);
        listaGeral.add(new Aluno()); // Aceita qualquer objeto

        List<Integer> listaValores = new ArrayList<>(); // Aceita apenas objetos do tipo Integer
        listaValores.add(7);
        listaValores.add(18);
        listaValores.add(25);
        listaValores.add(33);

        // Exibir valores da lista
        System.out.println("\n\nExibir valores da lista:");

        // for tradicional
        System.out.print("for tradicional: ");
        for (int i = 0; i < listaValores.size(); i++) {
            System.out.print(listaValores.get(i) + " ");
        }

        // for enhanced
        System.out.print("\nfor enhanced: ");
        for (Integer valor : listaValores) {
            System.out.print(valor + " ");
        }

        // forEach
        System.out.print("\nforEach: ");
        listaValores.forEach(valor -> {
            System.out.print(valor + " ");
        });

        // forEach com method reference
        System.out.print("\nforEach com method reference: ");
        listaValores.forEach(System.out::print);

        // Paralelismo, não imprime na ordem
        System.out.print("\nParalelismo (fora de ordem): ");
        listaValores.parallelStream().forEach(valor -> {
            System.out.print(valor + " ");
        });

        // Paralelismo, imprime na ordem
        System.out.print("\nParalelismo (em ordem): ");
        listaValores.parallelStream().forEachOrdered(valor -> {
            System.out.print(valor + " ");
        });

        System.out.print("\nParalelismo com method reference (em ordem): ");
        listaValores.parallelStream().forEachOrdered(System.out::print);
    }
}
