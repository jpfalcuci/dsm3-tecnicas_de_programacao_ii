package Q1_10_Vendas;

import java.util.Scanner;

/*
 * Uma venda de alimentos precisa contabilizar suas vendas. Para tanto, crie um programa que solicite
 * o usuário o informe de 10 vendas. A cada venda deverá ser informado: código produto, valor unitário e
 * quantidade. Use uma classe para representar a Venda. O programa deverá:
 *
 * a. A cada venda informada mostrar o valor total (quantidade * valor unitário);
 * b. Valor médio vendido;
 * c. Mostrar o código do produto, quantidade e valor total do produto com maior venda;
 * d. Mostrar o código do produto, quantidade e valor total do produto com menor venda;
 * e. Mostrar o valor Total Vendido;
 * f. Mostrar a quantidade total de itens vendidos;
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+--------------------------+");
        System.out.println("|          VENDAS          |");
        System.out.println("+--------------------------+");

        Scanner input = new Scanner(System.in);
        Venda v;
        Venda maiorVenda = null;
        Venda menorVenda = null;
        int quantidadeDeVendas = 3;
        int quantidadeTotalVendida = 0;
        double valorTotalVendido = 0D;
        double valorMedioVendido = 0D;

        System.out.println("Informe " + quantidadeDeVendas + " vendas:");
        for (int i = 0; i < quantidadeDeVendas; i++) {
            System.out.println("\n--- Venda " + (i + 1) + " ---");

            System.out.print("Código do produto: ");
            int codigoProduto = input.nextInt();
            System.out.print("Quantidade: ");
            int quantidade = input.nextInt();
            System.out.print("Valor unitário: ");
            double valorUnitario = input.nextDouble();

            v = new Venda(codigoProduto, quantidade, valorUnitario);
            System.out.println("Valor total: " + v.getValorTotal());

            quantidadeTotalVendida += v.getQuantidade();
            valorTotalVendido += v.getValorTotal();

            if (maiorVenda == null || v.getValorTotal() > maiorVenda.getValorTotal()) {
                maiorVenda = v;
            }

            if (menorVenda == null || v.getValorTotal() < menorVenda.getValorTotal()) {
                menorVenda = v;
            }
        }

        input.close();

        valorMedioVendido = Math.round(valorTotalVendido / quantidadeDeVendas * 100.0) / 100.0;

        System.out.println("\n+------------------------------------------+");
        System.out.println("|                  RESULTADO               |");
        System.out.println("+------------------------------------------+");
        System.out.println("Valor médio vendido ..........: " + valorMedioVendido);
        System.out.println("Produto com maior venda ......: " + maiorVenda);
        System.out.println("Produto com menor venda ......: " + menorVenda);
        System.out.println("Valor Total Vendido ..........: " + valorTotalVendido);
        System.out.println("Qtd total de itens vendidos ..: " + quantidadeTotalVendida);
        System.out.println("--------------------------------------------");
    }
}
