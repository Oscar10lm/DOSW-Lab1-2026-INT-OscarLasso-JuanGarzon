package reto1;
import java.util.List;
import java.util.Scanner;
public class Reto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LectorEstudiante lector = new LectorEstudiante(scanner);
        Mensaje mensajeBienvenida = new Mensaje();

        Estudiante estudianteA = lector.leer('A');
        Estudiante estudianteB = lector.leer('B');

        List<Estudiante> estudiantes = List.of(estudianteA, estudianteB);

        mensajeBienvenida.imprimirFichas(estudiantes);

        String saludo = mensajeBienvenida.generarSaludoConjunto(estudianteA, estudianteB);
        System.out.println(saludo);

        scanner.close();
    }
}