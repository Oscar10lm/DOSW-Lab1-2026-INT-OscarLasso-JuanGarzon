package reto7;

import java.util.List;
import java.util.stream.IntStream;
public class Reto7 {
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        int cantidad = entrada.leerCantidad();
        List<Jugador> jugadores = IntStream.range(0, cantidad).mapToObj(i -> {
            int numero = entrada.leerNumero();
            String nombre = entrada.leerNombre();
            long deuda = entrada.leerDeuda();

            return new Jugador(numero, nombre, deuda);
        }).toList();
        
        long premio = 0;
        //PRUEBA 1
        List<Jugador> ronda1 = LuzRojaLuzVerde.jugar(jugadores);

        int eliminadosRonda1 = jugadores.size() - ronda1.size();

        premio += eliminadosRonda1 * 50_000_000L;

        //PRUEBA 2
        List<Jugador> ronda2 = Dados.jugar(ronda1);

        int eliminadosRonda2 = ronda1.size() - ronda2.size();

        premio += eliminadosRonda2 * 50_000_000L;

        //PRUEBA 3
        List<Jugador> ganadores = PuenteCristal.jugar(ronda2);
        int eliminadosRonda3 = ronda2.size() - ganadores.size();
        premio += eliminadosRonda3 * 100_000_000L;

        //Repartir premio
        long premioIndividual = premio / ganadores.size();

        ganadores.stream().forEach(jugador -> {
            jugador.ganar();
            jugador.setPremio(premioIndividual);
            System.out.println("\n¡Jugador " + jugador.getNumero() + " Eres un ganador!");
            System.out.println("Premio: " + premioIndividual + " wones");
            });
        
    }
}
