import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {

        List<Double> lista = new ArrayList<>();

        int quantidadeDeItens = 15;
        int positivoOuNegativo = 1; // 1 para positivo, -1 para negativo

        // Popular o array com números decimais aleatórios
        for (int i = 0; i < quantidadeDeItens; i++) {
            double valor = Math.random() * 10 * positivoOuNegativo;
            double valorArredondado = (double) Math.round(valor * 100) / 100;
            lista.add(valorArredondado);
        }

        double maior = lista.get(0);
        double soma = 0.0;
        double menor = lista.get(0);
        int tamanhoLista = lista.size();
        double maiorMenorQueQuatroPontoDois = Double.NEGATIVE_INFINITY;

        System.out.print("Lista: ");
        for (double valor : lista) {
            System.out.print(valor + " ");

            soma += valor;

            if (valor > maior)
                maior = valor;

            if (valor < menor)
                menor = valor;

            if (valor < 4.2 && valor > maiorMenorQueQuatroPontoDois)
                maiorMenorQueQuatroPontoDois = valor;
        }

        double media = (double) soma / tamanhoLista;

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Soma: " + (double) Math.round(soma * 100) / 100);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média: " + (double) Math.round(media * 100) / 100);
        System.out.println("Maior valor (<4.2): " + maiorMenorQueQuatroPontoDois);
    }
}
