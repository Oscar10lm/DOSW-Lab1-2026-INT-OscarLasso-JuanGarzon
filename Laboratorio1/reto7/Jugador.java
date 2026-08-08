package reto7;

public class Jugador {
    private int numero;
    private String nombre;
    private long deuda;
    private long premio;
    private String estado;

    public Jugador(int numero, String nombre, long deuda){
        this.numero = numero;
        this.nombre = nombre;
        this.deuda = deuda;
        this.premio = 0;
        this.estado = "ACTIVO";
    }

    public int getNumero(){return numero;}
    public String getNombre(){return nombre;}
    public long getDeuda(){return deuda;}
    public long getPremio(){return premio;}
    public String getEstado(){return estado;}

    public void setEstado(String estado){this.estado = estado;}
    public void setPremio(long premio){this.premio = premio;}
    
    public void eliminar(){this.estado = "ELIMINADO";}
    public void ganar(){this.estado = "GANADOR";}
    public void agregarPremio(long cantidad){this.premio += cantidad;}

    @Override
    public String toString() {
        return numero + " - " + nombre + " | deuda: " + deuda + " | estado: " + estado;
    }
}
