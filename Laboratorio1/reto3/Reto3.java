package reto3;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = Entrada.leerMensaje();
        System.out.println("Canal A: '"  + Maquina.amplificar(mensaje) + "'");
        System.out.println("Descifrado final: ");
        Maquina.ejecutar(mensaje);
    }
}