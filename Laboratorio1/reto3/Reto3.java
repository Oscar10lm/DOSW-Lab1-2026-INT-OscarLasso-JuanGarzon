package reto3;

import java.util.function.Function;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = Entrada.leerMensaje();
        Function<String, String> descifrar = m -> Descifrador.revertir(m);
        String resultado = descifrar.apply(mensaje);
        System.out.println(resultado);
    }
}
