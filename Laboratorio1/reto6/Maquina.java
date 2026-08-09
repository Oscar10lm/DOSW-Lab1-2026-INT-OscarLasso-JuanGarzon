package reto6;
import java.util.HashMap;
import java.util.Map;

public class Maquina {

    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", () -> ejecutarA("SALUDAR"));
        comandos.put("DESPEDIR",() -> ejecutarA("DESPEDIR"));
        comandos.put("CANTAR", () -> ejecutarA("CANTAR"));
        comandos.put("DANZAR", () -> ejecutarA("DANZAR"));

        comandos.put("BROMEAR", () -> ejecutarB("BROMEAR"));
        comandos.put("GRITAR", () -> ejecutarB("GRITAR"));
        comandos.put("SUSURRAR", () -> ejecutarB("SUSURRAR"));
        comandos.put("ANALIZAR",() -> ejecutarB("ANALIZAR"));
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

    private static void ejecutarB(String comando) {
        switch (comando) {

            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU?");
                System.out.println("Porque necesitaba espacio...");
                break;

            case "GRITAR":
                System.out.println("¡¡¡STACK OVERFLOOOOOW!!!");
                break;

            case "SUSURRAR":
                System.out.println("psst... revisa el punto y coma de la línea 42.");
                break;

            case "ANALIZAR":
                System.out.println("Analizando datos... ¡Eres increíble!");
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

    public static void ejecutarTodos() {
        comandos.forEach((cmd, accion) -> accion.run());
    }
}