public class NucleoEnergia { 
    private String nombre; 
    private int capacidad; 

    public NucleoEnergia(String nombre, int capacidad){ 
        this.nombre = nombre; 
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public static NucleoEnergia crearInicial(){ 
        return new NucleoEnergia("Núcleo Principal", 300); 
    }
}