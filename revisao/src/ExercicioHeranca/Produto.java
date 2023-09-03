package ExercicioHeranca;

public class Produto {

    private int codigo;
    private String tipoDeProduto;
    private String descricao;
    private int quantidade;
    private double precoDeCusto;
    private double precoDeVenda;

    private String estado;

    // Construtor sobrescrito
    public Produto() { }

    public Produto(int codigo, String tipoDeProduto, String descricao, int quantidade, double precoDeCusto, String estado) {
        setCodigo(codigo);
        setTipoDeProduto(tipoDeProduto);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setPrecoDeCusto(precoDeCusto);
        setEstado(estado);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoDeProduto() {
        return tipoDeProduto;
    }

    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", tipoDeProduto='" + tipoDeProduto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", precoDeCusto=" + precoDeCusto +
                ", precoDeVenda=" + precoDeVenda +
                ", estado='" + estado + '\'' +
                '}';
    }
}
