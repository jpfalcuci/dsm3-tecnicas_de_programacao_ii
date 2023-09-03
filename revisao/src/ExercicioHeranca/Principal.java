package ExercicioHeranca;

public class Principal {
    public static void main(String[] args) {

        Produto p = new Produto(
            666,"A","Celular from hell",2,1000D,"RS"
        );

        Venda v;

        if("MG".equalsIgnoreCase(p.getEstado())) {
            v = new VendaMG();
        } else if ("RS".equalsIgnoreCase(p.getEstado())) {
            v = new VendaRS();
        } else {
            v = new Venda();
        }

        System.out.println(v.vender(p));
    }
}
