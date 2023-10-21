package cafeteria;

import java.util.ArrayList;
import java.util.List;

public class CafeteriaMain {

    public static void main(String[] args) {

        Bebida expresso = new Expresso();
        System.out.println(expresso.getDescricao() + " = R$" + expresso.getValor());

        Bebida conCafe = new ConCafe(expresso);
        System.out.println(conCafe.getDescricao() + " = R$" + conCafe.getValor());

        Bebida caConLatte = new CaConLatte(conCafe);
        System.out.println(caConLatte.getDescricao() + " = R$" + String.format("%.2f", caConLatte.getValor()));

        List<Bebida> listaBebidas = new ArrayList<Bebida>();
        listaBebidas.add(expresso);
        listaBebidas.add(conCafe);
        listaBebidas.add(caConLatte);

        Bebida bebidaPersonalizada = new BebidaPersonalizada(listaBebidas);
        System.out.println(
                bebidaPersonalizada.getDescricao() +
                "\nValor: " +
                String.format("%.2f", bebidaPersonalizada.getValor())
        );
    }
}
