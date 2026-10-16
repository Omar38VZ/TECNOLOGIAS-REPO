public class Motor {
    private String nombre;
    private int potencia;
    private NucleoEnergia nucleo;

    public Motor(String nombre, NucleoEnergia nucleo, int potencia) {
        this.nombre = nombre;
        this.nucleo = nucleo;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public NucleoEnergia getNucleo() {
        return nucleo;
    }

    public void setNucleo(NucleoEnergia nucleo) {
        this.nucleo = nucleo;
    }



}
