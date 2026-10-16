
import java.util.*;

public class Nave {
    private String nombre; 
    private int escudo; 
    private Motor motor;
    private List<Arma> armas; 
    private Tripulacion tripulacion; 

    public Nave(List<Arma> armas, int escudo, Motor motor, String nombre, Tripulacion tripulacion) {
        this.armas = armas;
        this.escudo = escudo;
        this.motor = motor;
        this.nombre = nombre;
        this.tripulacion = tripulacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }

    public Tripulacion getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(Tripulacion tripulacion) {
        this.tripulacion = tripulacion;
    }

    public void mostrar(int indice){ 
        System.out.println("[" + indice + "]" + nombre + "| escudo: " + escudo
            + " | motor: " + motor.getNombre() + " (potencia: " + motor.getPotencia() + ")"
            + " | nucleo:  " + motor.getNucleo().getNombre() + " (capacidad: " + motor.getNucleo().getCapacidad() + ")"
            + " | armas: " + armas + " | piloto" + tripulacion
        );
        System.out.println("     Identidades: nave:" + System.identityHashCode(this)
            + "motor: " + System.identityHashCode(motor)
            + " nucleo: " + System.identityHashCode(motor.getNucleo())
            + " listaArmas: " + System.identityHashCode(armas) 
         );
   
    }
}
