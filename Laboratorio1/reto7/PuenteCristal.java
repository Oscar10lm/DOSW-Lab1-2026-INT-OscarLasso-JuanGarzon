package reto7;

import java.util.List;

public class PuenteCristal {
    public static List<Jugador> jugar(List<Jugador> jugadores){
        System.out.println("\nPrueba 3 - Puente de Cristal: ");
        
        List<Jugador> sobrevivientes = jugadores.stream().filter(jugador -> {
                                                                            if (jugador.getNombre().length() < 5){
                                                                                jugador.eliminar();
                                                                                return false;
                                                                            }
                                                                            return true;
                                                                        }).toList();

        StringBuilder m = new StringBuilder();
        sobrevivientes.stream()
                        .forEach(jugador -> m.append(jugador.getNombre() + " "));
        m.append("PASAN");
        System.out.println(" " + m);
        jugadores.stream().filter(jugador -> jugador.getEstado().equals("ELIMINADO")).forEach(jugador -> System.out.println(" Jugador " + jugador.getNumero() + " ELIMINADO"));
        return sobrevivientes;
    }
}
