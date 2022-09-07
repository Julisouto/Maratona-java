package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroExercicio01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.nome = "Accent";
        carro.modelo = "1.5 12V GLS";
        carro.ano = 1995;

        carro2.nome = "Elantra";
        carro2.modelo = "Special Edition";
        carro2.ano = 2017;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println("------------------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
