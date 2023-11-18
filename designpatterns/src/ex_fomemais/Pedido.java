package ex_fomemais;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String nomeCliente;

    private StatusEnum status;

    private List<Produto> produtos;

    public void adicionarProduto(Produto produto) {
        if (this.produtos == null) {
            this.produtos = new ArrayList();
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", status='" + status + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
