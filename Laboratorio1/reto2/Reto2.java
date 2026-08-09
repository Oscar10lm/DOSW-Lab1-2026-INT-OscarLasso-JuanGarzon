package reto2;
import java.util.List;

public class Reto2 {
    public static void main(String[] args) {

        Entrada entrada = new Entrada();

        List<Integer> lista1 = entrada.leerLista(1);
        List<Integer> lista2 = entrada.leerLista(2);

        Resultados resultado1 = Calculador.analizar(lista1);
        Resultados resultado2 = Calculador.analizar(lista2);

        Resultados.mostrarResultado(1, resultado1);
        Resultados.mostrarResultado(2, resultado2);
    }
}