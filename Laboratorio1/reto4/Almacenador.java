package reto4;
import java.util.Hashtable;

public class Almacenador {
    private Hashtable<String, Integer> par = new Hashtable<>();

    public void almacenarPar(String clave, Integer valor) {
        par.put(clave, valor);
    }

    public void imprimirPar(){
        par.entrySet().stream().sorted((a,b) -> a.getKey().
                compareTo(b.getKey())).map(e -> "Clave: " + e.getKey().toUpperCase()
        + " | Valor: " + e.getValue()).forEach(System.out::println);
    }
}
