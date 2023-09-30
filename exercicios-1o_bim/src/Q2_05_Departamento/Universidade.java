package Q2_05_Departamento;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

    private List<Departamento> departamentos;

    public Universidade() {
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void exibirDepartamentos() {
        System.out.println("\n------------------------------");
        System.out.println("Departamentos da Universidade:");
        System.out.println("------------------------------");
        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
        }
        System.out.println("-----------------------------");
    }

    public void encontrarDepartamento(String departamentoNome) {
        Departamento departamentoBuscado = new Departamento(0, departamentoNome, "");
        Departamento departamentoEncontrado = null;

        System.out.println("\n-----------------------------");
        System.out.println("Buscando Departamento: " + departamentoNome);

        for (Departamento departamento : departamentos) {
            if (departamento.equals(departamentoBuscado)) {
                departamentoEncontrado = departamento;
                break;
            }
        }

        if (departamentoEncontrado != null) {
            System.out.println("Departamento encontrado:");
            System.out.println(departamentoEncontrado);
        } else {
            System.out.println("Departamento não encontrado.");
        }
        System.out.println("-----------------------------");
    }
}
