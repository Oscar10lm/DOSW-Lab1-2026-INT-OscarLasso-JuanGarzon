package reto7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Dados {
    public static List<Jugador> jugar(List<Jugador> jugadores) {
        Random random = new Random();
        Map<Integer, Integer> dados = new HashMap<>();

        System.out.println("\nPrueba 2 - Los Dados:");
        jugadores.stream().forEach(jugador ->dados.put(jugador.getNumero(),random.nextInt(6) + 1));
        List<Jugador> sobrevivientes = jugadores.stream().filter(jugador ->dados.get(jugador.getNumero()) % 2 == 0).collect(Collectors.toList());

        StringBuilder m = new StringBuilder();
        sobrevivientes.stream().forEach(j -> m.append(j.getNombre() + "(" + dados.get(j.getNumero()) + ") "));
        System.out.println(" " + m + " PASAN");
        
        jugadores.stream().filter(jugador ->dados.get(jugador.getNumero()) % 2 != 0).forEach(jugador ->jugador.eliminar());

        jugadores.stream().filter(jugador ->jugador.getEstado().equals("ELIMINADO")).forEach(jugador ->System.out.println(" Jugador " + jugador.getNumero() +" ELIMINADO"));

        return sobrevivientes;
    }
}