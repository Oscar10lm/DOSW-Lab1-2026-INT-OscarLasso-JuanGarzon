package reto5;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Entrada {
    public List<Integer> listaNumerica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de los guerreros (separados por comas): ");
        String listaNumerica =  sc.nextLine();
        String [] partes =  listaNumerica.split(",");
        List<Integer>numeros =  Arrays.stream(partes).map(e -> Integer.parseInt(e.trim())).
                collect(Collectors.toList());
        return numeros;

    }
}