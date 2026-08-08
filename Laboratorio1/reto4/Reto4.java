package reto4;

public class Reto4 {

    public static void main(String[] args) {

        Entrada entrada = new Entrada();
        Almacenador almacenador = new Almacenador();

        int cantidad = entrada.leerCantidad();
        for(int i = 0; i < cantidad; i++){

            String clave = entrada.leerClave();
            Integer valor = entrada.leerValor();
            almacenador.almacenarPar(clave, valor );
        }
        almacenador.imprimirPar();
    }
}