
public class Tortuga extends AdopcionAnimal {
    private String caparazon;

    public Tortuga(){

    }

    public Tortuga(String nombre, String raza, String tipo_alimento, int edad, String caparazon){
        super(nombre, raza, tipo_alimento, edad);
        this.caparazon = caparazon;
    }

    //get y set
    public String getCaparazon(){
        return caparazon;
    }

    public void setCaparazon(String caparazon){
        this.caparazon = caparazon;
    }

    public void mostrarTortuga(){
        System.out.println("El nombre de la tortuga es: " + getNombre() + "\n"
                        + "La raza de la tortuga es: " + getRaza() + "\n"
                        + "Se alimenta de: " + getTipo_Alimento() + "\n"
                        + "La tortuga tiene la edad de: " + getEdad() + " meses \n"
                        + "Su caparazon tiene: " + getCaparazon() + "\n" );
    }

    private String getEdad() {
        return null;
    }

    private String getTipo_Alimento() {
        return null;
    }

    private String getRaza() {
        return null;
    }

    private String getNombre() {
        return null;
    }
    
}


