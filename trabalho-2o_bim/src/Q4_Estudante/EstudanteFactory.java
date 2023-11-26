package Q4_Estudante;

public class EstudanteFactory {

    public static Estudante createEstudante(InstituicaoEnum instituicao) {

        Estudante estudante = switch (instituicao) {
            case UNIVERSITARIO -> new Universitario("Universidade de Franca");
            case FUNDAMENTAL -> new Fundamental("Escola Fundamental");
            case TECNICO -> new Tecnico("Fatec Franca");
            default -> null;
        };

        return estudante;

    }
}
