

public class Perros extends AdopcionAnimal {
    private String pelaje;

    public Perros(){

    }

    public Perros(String nombre, String raza, String tipo_alimento, int edad, String pelaje){
        super(nombre, raza, tipo_alimento, edad);
        this.pelaje = pelaje;
    }

    //get y set
    public String getPelaje(){
        return pelaje;
    }

    public void setPelaje(String pelaje){
        this.pelaje = pelaje;
    }

    public void mostrarPerros(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n"
                        + "La raza del perro es: " + getRaza() + "\n"
                        + "Se alimenta de: " + getTipo_Alimento() + "\n"
                        + "El perrito tiene la edad de: " + getEdad() + " años \n"
                        + "El pelaje del perrito es: " + getPelaje() + "\n" );
    }

    private String getTipo_Alimento() {
        return null;
    }

    private String getRaza() {
        return null;
    }

    private String getEdad() {
        return null;
    }

    private String getNombre() {
        return null;
    }
    
}

