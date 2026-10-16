package Bloque1.SOLID.Segregacion_Interfaces.Bugatti.NoAplicado;

public class DoñaFlorinda implements AccionesPersonaje{
    private final String nombre = "Doña Florinda"; 

    @Override
    public void darGolpe(){ 
        System.out.println(nombre + " Le da una cachetada a Don Ramón!");
    }
    @Override 
    public void pagarRenta(){ 
        throw new UnsupportedOperationException(nombre + ": Pago 5k"); 
    }
    @Override
    public void cobrarRenta(){ 
        throw new UnsupportedOperationException(nombre + ": No es dueño de la vecindad del xavo"); 

    }
    @Override 
    public void jugar(){ 
        throw new UnsupportedOperationException(nombre + ": No juega nada"); 
    }
    @Override 
    public void llorar(){ 
        throw new UnsupportedOperationException(nombre + ": Las mujeres no lloran, facturan");
    }

    
}