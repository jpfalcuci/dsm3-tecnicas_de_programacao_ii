package conjuntos;

import java.util.Objects;

public class Cliente {

    private Integer id;

    private String nome;

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "conjuntos.Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente that = (Cliente) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
