package Q4_Estudante;

public class Main {

    public static void main(String[] args) {

        Estudante e1 = EstudanteFactory.createEstudante(InstituicaoEnum.UNIVERSITARIO);
        System.out.println("Estudante 1: " + e1.getInstituicao());

        Estudante e2 = EstudanteFactory.createEstudante(InstituicaoEnum.FUNDAMENTAL);
        System.out.println("Estudante 2: " + e2.getInstituicao());

        Estudante e3 = EstudanteFactory.createEstudante(InstituicaoEnum.TECNICO);
        System.out.println("Estudante 3: " + e3.getInstituicao());
    }
}
