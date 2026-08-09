package reto5;

import java.util.List;

public class Reto5 {
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Almacenador almacenador = new Almacenador();

        List<Integer> numerosHashSet = entrada.leerNumeros("HashSet");
        numerosHashSet.stream().forEach(almacenador::almacenarHashSet);

        List<Integer> numerosTreeSet = entrada.leerNumeros("TreeSet");
        numerosTreeSet.stream().forEach(almacenador::almacenarTreeSet);

        almacenador.mostrarArena();
    }
}