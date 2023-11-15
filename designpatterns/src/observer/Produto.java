package observer;

public class Produto {

    private Long id;

    private Long quantidade;

    private Double precoVenda;

    private Double precoCusto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", precoVenda=" + precoVenda +
                ", precoCusto=" + precoCusto +
                '}';
    }
}
