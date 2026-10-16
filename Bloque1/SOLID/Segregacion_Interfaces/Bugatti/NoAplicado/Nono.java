package Bloque1.SOLID.Segregacion_Interfaces.Bugatti.NoAplicado;

public class Nono implements AccionesPersonaje{
    private final String nombre = "Nono"; 

    @Override
    public void darGolpe(){ 
        System.out.println(nombre + " No pega");
    }
    @Override 
    public void pagarRenta(){ 
        throw new UnsupportedOperationException(nombre + ": No paga renta!, su jefe es el mero mero"); 
    }
    @Override
    public void cobrarRenta(){ 
        throw new UnsupportedOperationException(nombre + ": Aveces cobra por su papá"); 

    }
    @Override 
    public void jugar(){ 
        throw new UnsupportedOperationException(nombre + ": Juega con sus pelotas"); 
    }
    @Override 
    public void llorar(){ 
        throw new UnsupportedOperationException(nombre + ": huja i huja i");
    }

    
}