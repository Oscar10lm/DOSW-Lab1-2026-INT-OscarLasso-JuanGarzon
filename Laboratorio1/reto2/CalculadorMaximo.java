package reto2;
import java.util.List;
import java.util.Optional;

public class CalculadorMaximo {
    public static int calculador(List<Integer> numeros){
        Optional<Integer> maximo = numeros.stream().max(Integer::compareTo);
        return maximo.orElse(0);
    }
}
