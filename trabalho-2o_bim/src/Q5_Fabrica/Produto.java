package Q5_Fabrica;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int codigo;
    private String descricao;
    private List<Fabricacao> fabricacoes = new ArrayList();

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void fabricarProduto(String dataFabricacao, int numeroLote, int quantidadeProduzida) {
        Fabricacao fabricacao = new Fabricacao(dataFabricacao, numeroLote, quantidadeProduzida);
        this.fabricacoes.add(fabricacao);
    }

    @Override
    public String toString() {
        return "Produto{ " +
                "codigo=" + codigo +
                ", " + fabricacoes.get(fabricacoes.size() - 1) +
                " }";
    }
}
