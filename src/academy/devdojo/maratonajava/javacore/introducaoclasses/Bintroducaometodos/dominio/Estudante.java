package academy.devdojo.maratonajava.javacore.introducaoclasses.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("---------------------------");
        System.out.println(this.nome);
        System.out.println(this.sexo);
        System.out.println(this.idade);
    }
}
