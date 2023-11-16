public class Cuyos extends AdopcionAnimal {
    private String conocido;

    public Cuyos() {

    }

    public Cuyos(String nombre, String raza, String tipo_alimento, int edad, String conocido) {
        super(nombre, raza, tipo_alimento, edad);
        this.conocido = conocido;
    }

    // Getters y setters de conocido
    public String getConocido() {
        return conocido;
    }

    public void setConocido(String conocido) {
        this.conocido = conocido;
    }

    public void mostrarCuyos() {
        System.out.println("El nombre del cuyo es: " + getNombre() + "\n"
                + "La raza del cuyo es: " + getRaza() + "\n"
                + "Son mejor conocidos como: " + getConocido() + "\n" // Cambio: "Son mejor conocidos como" en lugar de "Son mejor conocido como"
                + "Se alimenta de: " + getTipoAlimento() + "\n" // Cambio: getTipoAlimento() en lugar de getTipo_Alimento()
                + "El cuyo tiene la edad de: " + getEdad() + " años \n");
    }

    private String getTipoAlimento() {
        return null;
    }

    private String getEdad() {
        return null;
    }

    

    private String getRaza() {
        return null;
    }

    private String getNombre() {
        return null;
    }
}
