public abstract class MobHostil { 
    private String nombre; 
    private int salud;

    public MobHostil(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void quemarEnLava(){ 
        this.salud -= 5; 
        System.out.println("El mob hostil " + nombre + " ha perdido 5 puntos de salud, salud actual: " + salud);
    }

    public abstract void atacar(); 
}
