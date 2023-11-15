package decorator;

import java.util.List;

public class BebidaPersonalizada extends BlendDecorator {

    private List<Bebida> bebidas;

    public BebidaPersonalizada(List<Bebida> listaBebidas) {
        this.bebidas = listaBebidas;
    }

    @Override
    public String getDescricao() {
        String descricao = "Bebida personalizada:\n";

        for (Bebida b : bebidas) {
            descricao += b.getDescricao() + ", ";
        }

        return descricao;
    }

    @Override
    public Double getValor() {
        Double valorBase = 10D;

        for (Bebida b : bebidas) {
            valorBase += b.getValor();
        }

        return valorBase;
    }
}
