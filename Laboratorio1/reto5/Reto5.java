package reto5;
import java.util.List;
import java.util.HashSet;

public class Reto5 {
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Almacenador almacenador = new Almacenador();
        List<Integer> numeros = entrada.listaNumerica();
        almacenador.almacenarNumeros(numeros);
        HashSet<Integer> resultado = almacenador.eliminarMultiplos3();
        resultado.stream().forEach(n -> System.out.println("Número en arena: " + n));
    }
}