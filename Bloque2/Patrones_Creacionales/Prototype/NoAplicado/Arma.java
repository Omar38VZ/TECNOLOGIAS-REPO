public class Arma {
    private String nombre; 
    private int dano; 

    public Arma(int dano, String nombre) {
        this.dano = dano;
        this.nombre = nombre;
    }
    public void setNombre(String nombre){ 
        this.nombre = nombre; 
    }
    public String getNombre() {
        return nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override 
    public String toString(){ 
        return nombre + "(" + dano + ")";
    }
}
