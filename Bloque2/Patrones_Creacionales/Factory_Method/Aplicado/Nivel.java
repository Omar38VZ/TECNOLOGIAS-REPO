// Creador: define el factory method crearEnemigo() y lo usa en jugar()
public abstract class Nivel {
    protected String nombre; 

    public Nivel(String nombre){ 
        this.nombre = nombre;
    }

    public abstract Enemigo crearEnemigo(); 

    public void jugar(){ 
        Enemigo enemigo = crearEnemigo(); 
        int vidaJugador = 250;
        int danoJugador = 60; 
        int turno = 1;

        System.out.println("\n=== " + nombre + " ===");
        System.out.println("Aparece un " + enemigo.getNombre() + " con " + enemigo.getVida() + " de vida");
    
        while(enemigo.estaVivo() && vidaJugador > 0) { 
            System.out.println("\nTurno " + turno);

            enemigo.recibirDano(danoJugador);
            System.out.println("Has atacado al " + enemigo.getNombre() + ", le quedan " + enemigo.getVida() + " de vida");

            if(enemigo.estaVivo()){ 
                enemigo.atacar();
                vidaJugador = Math.max(0, vidaJugador - enemigo.getAtaque()); 
                System.out.println("¡Te han atacado! Te quedan " + vidaJugador + " puntos de vida");
            }
            turno++; 
        }

        if (vidaJugador > 0){ 
            System.out.println("¡Ganaste!");
        } else { 
            System.out.println("¡Perdiste! El " + enemigo.getNombre() + " te venció");
        }
    }
}
