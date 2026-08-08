package reto4;
import java.util.Scanner;

public class Entrada {
    private Scanner sc = new Scanner(System.in);

    public String leerClave (){
        System.out.println("Ingrese la clave: ");
        String clave = sc.nextLine();
        return clave;
    }

    public Integer leerValor (){
        System.out.println("Ingrese el valor: ");
        Integer valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public int leerCantidad (){
        System.out.println("Ingrese la cantidad de pares: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        return cantidad;
    }
}
