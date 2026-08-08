package reto2;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Entrada {
    public static List<Integer> listaNumerica (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la lista de numeros seguidos por comas: ");
        String listaNumerica = sc.nextLine();
        String [] partes = listaNumerica.split(",");
        List<Integer> numeros = Arrays.stream(partes).map(n -> Integer.parseInt(n.trim())).
                collect(Collectors.toList());
        return numeros;

    }
}
