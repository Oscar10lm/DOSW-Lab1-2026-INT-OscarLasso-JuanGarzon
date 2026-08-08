package reto2;
import java.util.List;

public class Reto2 {
    public static void main(String[] args){
        List<Integer> numeros = Entrada.listaNumerica();
        int maximo = CalculadorMinimo.calculador(numeros);
        int contador = Contador.contar(numeros);
        System.out.println("El número pequeño es " + maximo);
        System.out.println("La cantidad de datos ingresados son: " + contador);
    }
}