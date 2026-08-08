package reto3;

public class Descifrador {
    public static String revertir (String mensaje){
        StringBuffer m = new StringBuffer(mensaje);
        m.reverse();
        return m.toString();
    }
}

