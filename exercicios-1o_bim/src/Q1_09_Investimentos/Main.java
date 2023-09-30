package Q1_09_Investimentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * As aplicações financeiras apresentam diversas modalidades cujos rendimentos têm variações;
 * os rendimentos do tipo renda fixa, são indexados à taxa Selic. Dado a isso crie um programa que calcule
 * o rendimento em 12 meses, mês a mês, dada as possibilidades de investimento abaixo e indique qual
 * o mais vantajoso, considerando os valores a serem informados taxa selic e o capital para aplicação
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+---------------------------------------+");
        System.out.println("|             INVESTIMENTOS             |");
        System.out.println("+---------------------------------------+");

        BancoPagueMais bancoPG = new BancoPagueMais();
        BancoFuraBolso bancoFB = new BancoFuraBolso();
        Double taxaSelic;
        Double valorSimulacao;

        List<BancoPadrao> bancos = new ArrayList<>();
        List<Double> rendimentos = new ArrayList<>();
        bancos.add(bancoPG);
        bancos.add(bancoFB);

        String melhorBanco = "";
        Double maiorRendimento = 0D;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a taxa Selic (%) ...........: ");
        taxaSelic = input.nextDouble();
        System.out.print("Informe o valor da simulação (R$) ..: ");
        valorSimulacao = input.nextDouble();
        input.close();

        for (BancoPadrao banco : bancos) {
            rendimentos.add(simulacao(banco, taxaSelic, valorSimulacao));

            if (rendimentos.get(rendimentos.size() - 1) > maiorRendimento) {
                maiorRendimento = rendimentos.get(rendimentos.size() - 1);
                melhorBanco = banco.getNomeBanco();
            }

        }

        System.out.printf("\nO melhor banco é o %s com rendimento de R$ %5.2f\n", melhorBanco, maiorRendimento);
    }

    public static double simulacao(BancoPadrao banco, Double taxaSelic, Double valorSimulacao) {
        banco.depositar(valorSimulacao);

        System.out.println("\n----------- " + banco.getNomeBanco() + " -----------");
        System.out.println("Taxa Selic: " + taxaSelic + "%");
        System.out.println("Mês    Capital   Rendimento      Total");

        for (int i = 0; i < 12; i++) {
            double capitalAnterior = banco.getCapital();
            banco.passaOMes(taxaSelic);

            if (i == 2) { // Temporário; p/ encurtar saída do terminal
                System.out.println("                ...");
            }

            if (i > 1 && i < 10) {
                continue;
            }

            System.out.printf("%3d %10.2f %12.2f %10.2f\n", i + 1, capitalAnterior, banco.getRendimentoMes(),
                    banco.getCapital());
        }

        double rendimentoLiquido = banco.getRendimentoTotal() - banco.getDescontos();
        double saldoFinal = banco.getCapital() - banco.getDescontos();

        System.out.printf("Total de rendimentos ....: R$ %5.2f\n", banco.getRendimentoTotal());
        System.out.printf("Total de descontos ......: R$ %5.2f\n", banco.getDescontos());
        System.out.printf("Rendimento líquido ......: R$ %5.2f\n", rendimentoLiquido);
        System.out.printf("Saldo final .............: R$ %5.2f\n", saldoFinal);
        System.out.println("----------------------------------------");

        return rendimentoLiquido;
    }
}
