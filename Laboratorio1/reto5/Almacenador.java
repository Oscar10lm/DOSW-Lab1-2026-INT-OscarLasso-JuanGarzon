package reto5;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Almacenador {
    private HashSet<Integer> numerosGuerreros = new HashSet<>();

    public void almacenarNumeros (List<Integer> numeros){
        numerosGuerreros.addAll(numeros);
    }

    public HashSet<Integer> eliminarMultiplos3(){
        return numerosGuerreros.stream().filter(n -> n % 3 != 0).collect(Collectors.toCollection(HashSet::new));
    }
}
