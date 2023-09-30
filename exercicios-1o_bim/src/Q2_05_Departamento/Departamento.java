package Q2_05_Departamento;

public class Departamento {

    private int codigo;

    private String nome;

    private String areaConhecimento;

    public Departamento(int codigo, String nome, String areaConhecimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.areaConhecimento = areaConhecimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    @Override
    public String toString() {
        return "Departamento [Código: " + codigo + ", Nome: " + nome + ", Área de Conhecimento: " + areaConhecimento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((areaConhecimento == null) ? 0 : areaConhecimento.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Departamento other = (Departamento) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equalsIgnoreCase(other.nome))
            return false;
        return true;
    }
     
}
