package reto3;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Maquina {
    public static String revertir (String mensaje){
        StringBuffer m = new StringBuffer(mensaje);
        m.reverse();
        return m.toString();
    }
    public static String amplificar(String mensaje) {
        StringBuilder resultado = new StringBuilder();

        IntStream.range(0,3)
                .forEach(i-> {
                                if (i > 0){
                                    resultado.append(" ");
                                }
                                resultado.append(mensaje);
                            });
        
        return resultado.toString();
    }
    public static String descifrar(String mensaje) {
        String amplificado = Maquina.amplificar(mensaje);
        return Maquina.revertir(amplificado);
    }

    public static void ejecutar(String mensaje){
        Function<String, String> protocolo = texto -> descifrar(texto);

        String resultado = protocolo.apply(mensaje);

        System.out.println(resultado);
    }
}