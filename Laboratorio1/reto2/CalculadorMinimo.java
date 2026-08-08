package reto2;
import java.util.List;
import java.util.Optional;

public class CalculadorMinimo {
    public static int calculador(List<Integer> numeros) {
        Optional<Integer> minimo = numeros.stream().min(Integer::compareTo);
        return minimo.orElse(0);
    }
}
