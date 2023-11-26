package Q5_Fabrica;

public class Fabricacao {

    private String dataFabricacao;
    private int numeroLote;
    private int quantidadeProduzida;

    public Fabricacao(String dataFabricacao, int numeroLote, int quantidadeProduzida) {
        this.dataFabricacao = dataFabricacao;
        this.numeroLote = numeroLote;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    @Override
    public String toString() {
        return "Fabricacao{ " +
                "dataFabricacao='" + dataFabricacao + '\'' +
                ", numeroLote=" + numeroLote +
                " }";
    }
}
