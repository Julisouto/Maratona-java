package academy.devdojo.maratonajava.javacore.introducaoclasses.test;
import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Julianna";
        estudante.idade = 18;
        estudante.sexo = 'F';
        System.out.println(estudante.sexo);

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Saulo";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

    }
}
