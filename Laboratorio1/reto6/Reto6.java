package reto6;

import java.util.List;

public class Reto6 {
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        List<String> comandos = entrada.listaComandos();
        comandos.stream()
                .forEach(comando -> Maquina.ejecutarComando(comando));
        
        System.out.println("Todos los comandos: ");
        Maquina.ejecutarTodos();
    }
}