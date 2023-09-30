package Q1_10_Vendas;

public class Venda {

    private int codigoProduto;

    private int quantidade;

    private double valorUnitario;

    private double valorTotal;

    public Venda(int codigoProduto, int quantidade, double valorUnitario) {
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.setValorTotal();
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    private void setValorTotal() {
        this.valorTotal = this.getValorUnitario() * this.getQuantidade();
    }

    @Override
    public String toString() {
        return "Venda{" +
                "codigoProduto=" + codigoProduto +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
