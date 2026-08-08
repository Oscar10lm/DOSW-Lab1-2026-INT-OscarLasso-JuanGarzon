package reto7;

import java.util.List;
import java.util.stream.Collectors;

public class LuzRojaLuzVerde {
    public static List<Jugador> jugar(List<Jugador> jugadores){
        List<Jugador> sobrevivientes = jugadores.stream()
                                        .filter(jugador -> {
                                            if (jugador.getDeuda() > 170000000){
                                                jugador.eliminar();
                                                return false;
                                            }
                                            return true;
                                        })
                                        .collect(Collectors.toList());
        
        System.out.println("\nPrueba 1 - Luz Roja Luz Verde: ");

        StringBuilder m = new StringBuilder();
        sobrevivientes.stream()
                        .forEach(jugador -> m.append(jugador.getNombre() + " "));
        m.append("PASAN");
        System.out.println(" " + m);
        jugadores.stream().filter(jugador -> jugador.getEstado().equals("ELIMINADO")).forEach(jugador -> System.out.println(" Jugador " + jugador.getNumero() + " ELIMINADO"));
        return sobrevivientes;
    }
}
