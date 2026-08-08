package reto5;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Almacenador {
    private TreeSet<Integer> numerosOrdenados = new TreeSet<>();

    public void almacenarNumeros(List<Integer> numeros) {
        numerosOrdenados.addAll(numeros);
    }

    public TreeSet<Integer> eliminarMultiplos5(){
        return numerosOrdenados.stream().filter(n -> n % 5 != 0).
        collect(Collectors.toCollection(TreeSet::new));


    }
}
