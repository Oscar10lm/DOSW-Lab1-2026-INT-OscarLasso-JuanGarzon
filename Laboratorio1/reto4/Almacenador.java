package reto4;

import java.util.HashMap;

public class Almacenador {
    private HashMap<String, Integer> par = new HashMap<>();

    public void almacenarPar(String clave, Integer valor){
        if (!par.containsKey(clave)){
            par.put(clave, valor);
        }
        
    }

    public void imprimirPar(){
        par.entrySet().stream().sorted((a,b) -> a.getKey().
                compareTo(b.getKey())).map(e -> "Clave: " + e.getKey().toUpperCase()
        + " | Valor: " + e.getValue()).forEach(System.out::println);
    }
}
