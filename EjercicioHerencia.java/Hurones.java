
public class Hurones extends AdopcionAnimal {
    private String afecto;

    public Hurones(){

    }

    public Hurones(String nombre, String raza, String tipo_alimento, int edad, String afecto){
        super(nombre, raza, tipo_alimento, edad);
        this.afecto = afecto;
    }

    //get y set
    public String getAfecto(){
        return afecto;
    }

    public void setAfecto(String afecto){
        this.afecto = afecto;
    }

    public void mostrarHurones(){
        System.out.println("El nombre del huron es: " + getNombre() + "\n"
                        + "La raza del huron es: " + getRaza() + "\n"
                        + "Se alimenta de: " + getTipo_Alimento() + "\n"
                        + "El huron tiene la edad de: " + getEdad() + " meses \n"
                        + "A el huron le gusta el " + getAfecto() + "\n" );
    }

    private String getEdad() {
        return null;
    }

    private String getRaza() {
        return null;
    }

    private String getTipo_Alimento() {
        return null;
    }

    private String getNombre() {
        return null;
    }
}

