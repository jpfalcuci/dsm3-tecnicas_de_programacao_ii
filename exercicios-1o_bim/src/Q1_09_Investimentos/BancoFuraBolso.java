package Q1_09_Investimentos;

public class BancoFuraBolso extends BancoPadrao {

    public BancoFuraBolso() {
        super("Banco Fura Bolso");
    }

    public void aplicaRendimento(Double taxaSelic) {
        double percentualSelic = 0.93;
        double rendimento = this.getCapital() * (taxaSelic * percentualSelic / 100);

        this.setRendimentoMes(rendimento);
        this.setRendimentoTotal(rendimento);
        this.depositar(this.getRendimentoMes());
    }

    public void aplicaDescontos() {
        double percentualImposto = 0.06;
        double percentualSobreCapital = 0.01;

        this.setTaxaAdministrativa(this.getCapital() * percentualSobreCapital);
        this.setImposto(this.getRendimentoMes() * percentualImposto);
    }
}
