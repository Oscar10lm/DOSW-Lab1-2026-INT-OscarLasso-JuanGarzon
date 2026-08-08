package reto7;

import java.util.Scanner;

public class Entrada {
    private Scanner sc = new Scanner(System.in);

    public int leerCantidad (){
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        return cantidad;
    }
    
    public Integer leerNumero(){
        System.out.println("Ingrese el número del jugador: ");
        Integer valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public String leerNombre(){
        System.out.println("Ingresa nombre del jugador: ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public long leerDeuda(){
        System.out.println("Ingresa deuda del jugador: ");
        long deuda = sc.nextLong();
        sc.nextLine();
        return deuda;
    }
}
