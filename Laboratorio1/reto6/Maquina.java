package reto6;
import java.util.HashMap;
import java.util.Map;

public class Maquina {

    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR",
                () -> ejecutarA("SALUDAR"));

        comandos.put("DESPEDIR",
                () -> ejecutarA("DESPEDIR"));

        comandos.put("CANTAR",
                () -> ejecutarA("CANTAR"));

        comandos.put("DANZAR",
                () -> ejecutarA("DANZAR"));
    }

    private static void ejecutarA(String comando) {

        switch (comando) {

            case "SALUDAR":
                System.out.println("¡Saludos, viajero del Tiempo y del código!");
                break;

            case "DESPEDIR":
                System.out.println("Hasta la próxima compilación, viajero.");
                break;

            case "CANTAR":
                System.out.println("La la la... compilando melodías en tiempo real.");
                break;

            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
                break;

            default:
                break;
        }
    }

    public static void ejecutarComando(String comando) {

        Runnable accion = comandos.get(comando);

        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Comando no disponible.");
        }
    }
}