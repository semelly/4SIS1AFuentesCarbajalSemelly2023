

import java.util.ArrayList;

public class inventario {
    private ArrayList<Cereal> inventarioCereales;

    public inventario() {
        this.inventarioCereales = new ArrayList<>();
    }

    public void agregarCereal(Cerial cereal1) {
        inventarioCereales.add(cereal1);
    }

    public ArrayList<Cereal> getInventarioCereales() {
        return inventarioCereales;
    }

    public void setVisible(boolean b) {
    }

    public void agregarCereal(Cerial cereal2) {
    }
}
