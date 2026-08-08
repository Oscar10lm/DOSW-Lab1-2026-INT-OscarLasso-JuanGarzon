package reto3;

public class Descifrador {
    public static String triplicar(String mensaje) {
        StringBuilder m = new StringBuilder((mensaje + " ").repeat(3).trim());
        return m.toString();
    }
}
