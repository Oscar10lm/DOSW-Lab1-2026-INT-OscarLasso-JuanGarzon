package reto5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Entrada {
    private Scanner sc = new Scanner(System.in);
    public List<Integer> leerNumeros(String tipo) {
        System.out.println("Ingrese los números para " + tipo + " separados por comas:");
        String entrada = sc.nextLine();
        return Arrays.stream(entrada.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}