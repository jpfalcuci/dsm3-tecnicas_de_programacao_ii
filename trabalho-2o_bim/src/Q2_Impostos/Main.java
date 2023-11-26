package Q2_Impostos;

public class Main {

    public static void main(String[] args) {

        Impostos impostoMunicipal = new ImpostoMunicipal();
        Impostos impostoEstadual = new ImpostoEstadual();

        double valor = 1000D;

        System.out.println("Valor: " + valor);
        System.out.println("Imposto Municipal: " + impostoMunicipal.calcularImposto(valor));
        System.out.println("Imposto Estadual: " + impostoEstadual.calcularImposto(valor));
    }
}
