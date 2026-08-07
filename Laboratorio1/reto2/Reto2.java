package reto2;
import java.util.List;


public class Reto2 {
    public static void main(String[] args) {
        List<Integer> numeros = Entrada.listaNumerica();
        int maximo = CalculadorMaximo.calculador(numeros);
        System.out.println("El número mas grande es: " + maximo);
    }
}