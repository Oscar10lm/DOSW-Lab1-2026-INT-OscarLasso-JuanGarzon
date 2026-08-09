package reto2;

public class Resultados {

    private int mayor;
    private int menor;
    private int cantidad;
    private boolean multiploDe2;
    private boolean divisibleEntre2;
    private boolean cantidadPar;

    public Resultados(int mayor, int menor, int cantidad,
                      boolean multiploDe2,
                      boolean divisibleEntre2,
                      boolean cantidadPar) {

        this.mayor = mayor;
        this.menor = menor;
        this.cantidad = cantidad;
        this.multiploDe2 = multiploDe2;
        this.divisibleEntre2 = divisibleEntre2;
        this.cantidadPar = cantidadPar;
    }

    public int getMayor() {
        return mayor;
    }

    public int getMenor() {
        return menor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isMultiploDe2() {
        return multiploDe2;
    }

    public boolean isDivisibleEntre2() {
        return divisibleEntre2;
    }

    public boolean isCantidadPar() {
        return cantidadPar;
    }

    public static void mostrarResultado(
            int numeroLista,
            Resultados resultado) {

        System.out.println(
                "Lista " + numeroLista +
                " => max:" + resultado.getMayor() +
                " min:" + resultado.getMenor() +
                " cant:" + resultado.getCantidad());

        System.out.println(
                "¿" + resultado.getMayor() +
                " múltiplo de 2? " +
                (resultado.isMultiploDe2() ? "Sí" : "No"));

        System.out.println(
                "¿" + resultado.getMayor() +
                " divisible entre 2? " +
                (resultado.isDivisibleEntre2() ? "Sí" : "No"));

        System.out.println(
                "¿Cantidad (" + resultado.getCantidad() +
                ") es " +
                (resultado.isCantidadPar() ? "par? Sí" : "impar? Sí"));

        System.out.println();
    }
}