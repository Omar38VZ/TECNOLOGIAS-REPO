public class NucleoEnergia implements Prototipo{ 
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

    @Override 
    public NucleoEnergia clonar() { 
        return new NucleoEnergia(nombre, capacidad);
    }
    public static NucleoEnergia crearInicial(){ 
        return new NucleoEnergia(); 
    }
}