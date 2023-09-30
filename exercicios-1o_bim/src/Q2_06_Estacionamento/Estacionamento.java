package Q2_06_Estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Veiculo> veiculosEstacionados = new ArrayList<>();

    public List<Veiculo> getVeiculosEstacionados() {
        return veiculosEstacionados;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculosEstacionados.add(veiculo);
    }

    public void calcularTotal() {
        double total = 0D;
        for (Veiculo veiculo : veiculosEstacionados) {
            System.out.println(veiculo);
            total += veiculo.calcularTaxa();
        }
        System.out.println("Receita total: R$ " + total);
    }
}
