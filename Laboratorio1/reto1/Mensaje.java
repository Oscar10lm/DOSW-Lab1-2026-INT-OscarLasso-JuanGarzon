package reto1;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Mensaje {

    private static final Function<Estudiante, String> datosEstudiante = e ->
            "semestre: " + e.getSemestre() + "\nedad: "
                    + e.getEdad() + "\ncorreo: " + e.getCorreo();

    public void imprimirFichas(List<Estudiante> estudiantes) {
        IntStream.range(0, estudiantes.size())
                .mapToObj(i -> {
                    char letra = (char) ('A' + i);
                    Estudiante e = estudiantes.get(i);
                    return "Estudiante " + letra + ": " + e.getNombre() + "\n" + datosEstudiante.apply(e);
                })
                .forEach(System.out::println);
    }

    public String generarSaludoConjunto(Estudiante a, Estudiante b) {
        return "¡Hola, bienvenidos! Somos la pareja conformada\n"
                + "por " + a.getNombre() + ", estudiante de " + a.getSemestre() + "° semestre de " + a.getEdad() + "\n"
                + "años, y " + b.getNombre() + ", de " + b.getSemestre() + "° semestre de " + b.getEdad() + "\n"
                + "años. Nuestros correos son:\n"
                + a.getCorreo() + " y\n"
                + b.getCorreo() + ".";
    }
}