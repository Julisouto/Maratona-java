package academy.devdojo.maratonajava.javacore.introducaoclasses.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(21,0);
        System.out.println(result);
    }
}
