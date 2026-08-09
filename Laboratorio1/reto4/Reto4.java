package reto4;

import java.util.stream.IntStream;

public class Reto4 {
    public static void main(String[] args) {

        Entrada entrada = new Entrada();
        Almacenador almacenador = new Almacenador();

        System.out.println("HashMap:");
        int cantidadHashMap = entrada.leerCantidad();

        IntStream.range(0,cantidadHashMap).forEach(i ->{
            String clave = entrada.leerClave();
            Integer valor = entrada.leerValor();
            almacenador.almacenarPar(clave, valor, true);
        });

        System.out.println("\nHashTable:");
        int cantidadHashtable = entrada.leerCantidad();
        
        IntStream.range(0, cantidadHashtable).forEach(i -> {
            String clave = entrada.leerClave();
            Integer valor = entrada.leerValor();
            almacenador.almacenarPar(clave,valor,false);
        });
        almacenador.imprimirPar();
    }
}