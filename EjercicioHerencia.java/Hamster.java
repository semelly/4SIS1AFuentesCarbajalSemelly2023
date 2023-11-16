
public class Hamster extends AdopcionAnimal{
    private String color;

    public Hamster(){

    }
    
    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String color){
        super(nombre, raza, tipo_alimento, edad);
        this.color = color;
    }

    //get y set
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void mostrarHamster(){
        System.out.println("El nombre del hamster es: " + getNombre() + "\n"
                        + "La raza del hamster es: " + getRaza() + "\n"
                        + "Se alimenta de: " + getTipo_Alimento() + "\n"
                        + "El hamster tiene la edad de: " + getEdad() + " años \n"
                        + "El color del hamster es: " + getColor() + "\n" );
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
