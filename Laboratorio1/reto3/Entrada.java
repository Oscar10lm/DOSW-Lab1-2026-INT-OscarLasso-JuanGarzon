package reto3;

import java.util.Scanner;

public class Entrada {
    public static String leerMensaje () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mensaje: ");
        String mensaje = sc.nextLine();
        return mensaje;
    }
}
