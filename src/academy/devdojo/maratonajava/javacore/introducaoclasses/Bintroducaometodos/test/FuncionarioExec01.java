package academy.devdojo.maratonajava.javacore.introducaoclasses.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExec01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Julius");
        funcionario.setIdade(40);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();
        System.out.println(funcionario.getMedia());
    }
}
