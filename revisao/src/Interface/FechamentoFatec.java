package Interface;

import java.util.List;

public class FechamentoFatec implements FechamentoLetivoInterface {

    @Override
    public Double calcularMedia(List<Double> notas) {

        Double somaNotas = 0D;
        Double media;

        for (Double nota : notas) {
            somaNotas += nota;
        }

        if (notas.size() > 5) {
            media = (somaNotas / notas.size()) * 1.1;
        } else {
            media = somaNotas / notas.size();
        }

        return media;
    }

    @Override
    public Double validarAprovacao(Double media, Double notaExame) {
        return null;
    }
}
