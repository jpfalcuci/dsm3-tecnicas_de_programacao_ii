package Q1_06_CalculadoraINSS;

import java.util.Scanner;

/*
 * Crie um programa que permita calcular o valor do salário líquido de um funcionário considerando o desconto do INSS.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+---------------------------------------+");
        System.out.println("|          CALCULADORA DE INSS          |");
        System.out.println("+---------------------------------------+");

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o salário bruto (R$) __: ");
        double salario = input.nextDouble();
        input.close();

        double[] aliquotaDeducao = calculaAliquotaDeducao(salario);
        double aliquota = aliquotaDeducao[0];
        double deducao = aliquotaDeducao[1];
        double descontoINSS = (salario * aliquota) - deducao;

        System.out.println("Alíquota INSS (%) _____________: " + aliquota * 100);
        System.out.println("Desconto INSS (R$) ____________: " + descontoINSS);
        System.out.println("Salário líquido (R$) __________: " + (salario - descontoINSS));
        System.out.println("-----------------------------------------");
    }

    /*
     * Função para calcular aliquota e dedução do INSS
     */
    public static double[] calculaAliquotaDeducao(double salario) {
        double aliquota;
        double deducao;

        if (salario <= 1212D) {
            aliquota = 0.075;
            deducao = 0D;
        } else if (salario <= 2427.35) {
            aliquota = 0.09;
            deducao = 18.18;
        } else if (salario <= 3641.03) {
            aliquota = 0.12;
            deducao = 91D;
        } else {
            aliquota = 0.14;
            deducao = 163.82;
        }

        return new double[] {aliquota, deducao};
    }
}
