// Clase Perros
class Perros {
    private String nombre;
    private String raza;
    private String comidaFavorita;
    private int edad;
    private String descripcion;

    public Perros(String nombre, String raza, String comidaFavorita, int edad, String descripcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
        this.edad = edad;
        this.descripcion = descripcion;
    }

    public void mostrarPerros() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Comida favorita: " + comidaFavorita);
        System.out.println("Edad: " + edad);
        System.out.println("Descripción: " + descripcion);
    }
}

// Clase Hamster
class Hamster {
    // ... (similar a la clase Perros)
}

// Clase Conejos
class Conejos {
    // ... (similar a la clase Perros)
}

// Clase Cuyos
class Cuyos {
    // ... (similar a la clase Perros)
}

// Clase Hurones
class Hurones {
    // ... (similar a la clase Perros)
}

// Clase Tortuga
class Tortuga {
    // ... (similar a la clase Perros)
}
