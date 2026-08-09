package reto2;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Entrada {
        private Scanner sc = new Scanner(System.in);
        public List<Integer> leerLista (int numeroLista) {
                System.out.println("Escribe los numeros de la lista " + numeroLista + " separados por comas: ");
                String entrada = sc.nextLine();
                return Arrays.stream(entrada.split(",")).map(String::trim).map(Integer::parseInt).toList();
    }
}
