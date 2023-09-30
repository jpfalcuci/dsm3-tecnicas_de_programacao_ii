package Q1_09_Investimentos;

public class BancoPagueMais extends BancoPadrao {

    public BancoPagueMais() {
        super("Banco Pague Mais");
    }

    public void aplicaRendimento(Double taxaSelic) {
        double percentualSelic = 0.85;
        double rendimento = this.getCapital() * (taxaSelic * percentualSelic / 100);

        this.setRendimentoMes(rendimento);
        this.setRendimentoTotal(rendimento);
        this.depositar(this.getRendimentoMes());
    }

    public void aplicaDescontos() {
        double percentualTaxaAdministrativa = 0.1;
        this.setTaxaAdministrativa(this.getRendimentoMes() * percentualTaxaAdministrativa);
    }
}
