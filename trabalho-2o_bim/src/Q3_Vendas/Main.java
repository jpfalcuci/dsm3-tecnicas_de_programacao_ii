package Q3_Vendas;

public class Main {

    public static void main(String[] args) {

        double precoCusto = 10.0;

        System.out.println("Preços de venda:");

        Produto bolacha = new Bolacha();
        System.out.println("Bolacha: " + bolacha.calcularPrecoVenda(precoCusto));

        Produto bala = new Bala();
        System.out.println("Bala: " + bala.calcularPrecoVenda(precoCusto));

        Produto bombom = new Bombom();
        System.out.println("Bombom: " + bombom.calcularPrecoVenda(precoCusto));

        Produto doceGenerico = new DoceGenerico();
        System.out.println("Doce genérico: " + doceGenerico.calcularPrecoVenda(precoCusto));
    }
}
