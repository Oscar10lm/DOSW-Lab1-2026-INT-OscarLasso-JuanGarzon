package reto5;
import java.util.List;
import java.util.TreeSet;

public class Reto5 {
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Almacenador almacenador = new Almacenador();
        List<Integer> numeros = entrada.listaNumerica();
        almacenador.almacenarNumeros(numeros);
        TreeSet<Integer> resultado = almacenador.eliminarMultiplos5();
        resultado.stream().forEach(n -> System.out.println("Número en arena: " + n));
        }

    }

