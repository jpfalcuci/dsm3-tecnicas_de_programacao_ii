package ExercicioHeranca;

public abstract class Imposto {
    // Classe abstrata não pode ser instanciada

    public Integer calcularImposto(Produto p, String tipo) {
        // Método concreto, pode ser sobrescrito
        return 10;
    }

    public abstract Integer calcularICMS(Produto p);
    // Método abstrato, deve ser sobrescrito

}
