package reto1;
import java.util.Scanner;
public class LectorEstudiante {

    private final Scanner scanner;

    public LectorEstudiante(Scanner scanner) {
        this.scanner = scanner;
    }

    public Estudiante leer(char letra) {
        System.out.print("Estudiante " + letra + ": ");
        String nombre = scanner.nextLine();

        System.out.print("semestre: ");
        int semestre = scanner.nextInt();
        scanner.nextLine();

        System.out.print("edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("correo: ");
        String correo = scanner.nextLine();

        System.out.println();
        return new Estudiante(nombre, edad, correo, semestre);
    }
}