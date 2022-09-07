package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "João";
        professor.idade = 30;
        professor.sexo = 'M';
        System.out.println("O professor " +professor.nome + ", tem " + professor.idade + " anos de idade " + professor.sexo);
    }
}
