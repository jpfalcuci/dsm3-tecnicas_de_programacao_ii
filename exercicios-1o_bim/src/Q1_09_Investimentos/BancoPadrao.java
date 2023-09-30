package Q1_09_Investimentos;

public abstract class BancoPadrao implements RendimentoEDescontosInterface {

    private String nomeBanco;
    private Double capital = 0D;
    private Double rendimentoMes;
    private Double rendimentoTotal = 0D;
    private Double taxaAdministrativa = 0D;
    private Double imposto = 0D;

    public BancoPadrao(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Double getCapital() {
        return capital;
    }

    public void depositar(Double valor) {
        this.capital = this.getCapital() + valor;
    }

    public Double getRendimentoMes() {
        return rendimentoMes;
    }

    public void setRendimentoMes(Double rendimentoMes) {
        this.rendimentoMes = rendimentoMes;
    }

    public Double getRendimentoTotal() {
        return rendimentoTotal;
    }

    public void setRendimentoTotal(Double rendimentoMes) {
        this.rendimentoTotal += rendimentoMes;
    }

    public Double getTaxaAdministrativa() {
        return taxaAdministrativa;
    }

    public void setTaxaAdministrativa(Double taxaAdministrativa) {
        this.taxaAdministrativa += taxaAdministrativa;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto += imposto;
    }

    public double getDescontos() {
        return this.getTaxaAdministrativa() + this.getImposto();
    }

    public void passaOMes(Double taxaSelic) {
        this.aplicaRendimento(taxaSelic);
        this.aplicaDescontos();
    }
}
