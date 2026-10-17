// Sin Factory Method: Nivel decide con if/else qué enemigo crear.
// Para agregar un nivel o enemigo nuevo hay que modificar esta clase.
public class Nivel {

    private int tipoNivel; 

    public Nivel(int tipoNivel){ 
        this.tipoNivel = tipoNivel;
    }

    public void jugar(){ 
        String nombre = ""; 
        Enemigo enemigo = null; 

        if (tipoNivel == 1){ 
            nombre = "Bosque Embrujado"; 
            enemigo = new Lobo();
        } else if (tipoNivel == 2){ 
            nombre = "Castillo Infernal"; 
            enemigo = new Esqueleto();
        } else if (tipoNivel == 3){
            nombre = "Volcan Infernal"; 
            enemigo = new Dragon();
        } else {
            System.out.println("\nEl nivel " + tipoNivel + " no existe");
            return;
        }

        System.out.println("\n=== " + nombre + " ===");
        System.out.println("Aparece un " + enemigo.getNombre() + " con " + enemigo.getVida() + " de vida");
        int vidaJugador = 1500; 

        while (enemigo.estaVivo() && vidaJugador > 0) {
            enemigo.recibirDano(200); 
            
            if (enemigo.estaVivo()){
                enemigo.atacar();
                vidaJugador = Math.max(0, vidaJugador - enemigo.getAtaque());
            }
        }

        if (vidaJugador > 0){ 
            System.out.println("¡Ganaste, chaval! Te quedan " + vidaJugador + " puntos de vida");
        } else { 
            System.out.println("Perdiste, eres noob");
        }
    }
}
