package reto6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Entrada {
    public List<String> listaComandos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la lista de comandos en mayuscula seguidos por comas: ");
        String listaComandos = sc.nextLine();
        String [] partes = listaComandos.split(",");
        List<String> comandos = Arrays.stream(partes).map(n-> n.trim()).collect(Collectors.toList());

        return comandos;
    }
}
