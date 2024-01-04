package Ultimo;

public class Servicio {
    private String nombre;
    private double monto;

    public Servicio(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }
}