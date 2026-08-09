package reto2;

import java.util.List;
import java.util.function.Function;
public class Calculador {
    public static Resultados analizar(List<Integer> lista) {
        //Obtener mayor
        Function<List<Integer>, Integer> mayor = numeros -> numeros.stream().max(Integer::compareTo).orElse(0);
        //Obtener menor
        Function<List<Integer>, Integer> menor = numeros -> numeros.stream().min(Integer::compareTo).orElse(0);
        //Obtener cantidad
        Function<List<Integer>, Integer> cantidad = numeros -> numeros.size();

        int maximo = mayor.apply(lista);
        int minimo = menor.apply(lista);
        int cantidadDatos = cantidad.apply(lista);

        boolean multiploDe2 = maximo % 2 ==0;
        boolean divisibleEntre2 = maximo % 2 ==0;
        boolean cantidadPar = cantidadDatos % 2 ==0;

        return new Resultados(maximo, minimo, cantidadDatos, multiploDe2, divisibleEntre2, cantidadPar);
    }
}
