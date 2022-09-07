package academy.devdojo.maratonajava.javacore.introducaoclasses.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaoclasses.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Bruno";
        estudante01.idade = 8;
        estudante01.sexo = 'M';

        estudante02.nome = "Lara";
        estudante02.idade = 6;
        estudante02.sexo = 'F';

        estudante02.imprime();
        estudante01.imprime();

    }
}