package reto2;

import java.util.List;

public class Contador {
    public static int contar(List<Integer> numeros) {
        return (int) numeros.stream().count();
    }
}
