public class Conejos extends AdopcionAnimal {
    private int manchas;

    public Conejos(){

    }

    public Conejos(String nombre, String raza, String tipo_alimento, int edad, int manchas){
        super(nombre, raza, tipo_alimento, edad);
        this.manchas = manchas;
    }

    // Getters y setters de manchas
    public int getManchas(){
        return manchas;
    }

    public void setManchas(int manchas){
        this.manchas = manchas;
    }

    public void mostrarConejos(){
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
                        + "La raza del conejo es: " + getRaza() + "\n"
                        + "Se alimenta de: " + getTipoAlimento() + "\n" // Cambio: getTipoAlimento() en lugar de getTipo_Alimento()
                        + "El conejo tiene la edad de: " + getEdad() + " años \n" // Cambio: "años" en lugar de "año"
                        + "El conejo tiene " + getManchas() + " manchas \n");
    }

    private String getEdad() {
        return null;
    }

    private String getTipoAlimento() {
        return null;
    }

    private String getRaza() {
        return null;
    }

    private String getNombre() {
        return null;
    }
}
