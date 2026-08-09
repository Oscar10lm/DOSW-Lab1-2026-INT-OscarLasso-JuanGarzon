package reto4;
import java.util.Hashtable;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;

public class Almacenador{
    private Hashtable<String, Integer> tablaHash = new Hashtable<>();
    private HashMap<String, Integer> mapaHash = new HashMap<>();

    public void almacenarPar(String clave, Integer valor, boolean esHashMap){
        if (esHashMap){
            mapaHash.putIfAbsent(clave, valor);
        }else{
            tablaHash.put(clave, valor);
        }
    }

    public void imprimirPar(){
        Map<String, Integer> resultado = Stream.concat(mapaHash.entrySet().stream(), tablaHash.entrySet().stream())
                                                .collect(Collectors.toMap(entrada -> entrada.getKey().toUpperCase(), entrada -> entrada.getValue(), (valorMapa, valorTabla) -> valorTabla));
        resultado.entrySet().stream().map(entrada -> "Clave: " + entrada.getKey() + " | Valor: " + entrada.getValue()).sorted().forEach(System.out::println);
    }
}