public class Nono implements AccionesPersonaje {
    private final String nombre = "Ñoño"; 

    @Override
    public void darGolpe(){ 
        throw new UnsupportedOperationException(nombre + ": No pega");
    }
    @Override 
    public void pagarRenta(){ 
        throw new UnsupportedOperationException(nombre + ": No paga renta, su papá es el dueño"); 
    }
    @Override
    public void cobrarRenta(){ 
        throw new UnsupportedOperationException(nombre + ": A veces cobra, pero por su papá"); 
    }
    @Override 
    public void jugar(){ 
        System.out.println(nombre + ": Juega con sus pelotas"); 
    }
    @Override 
    public void llorar(){ 
        System.out.println(nombre + ": ¡Buaaa, buaaa!");
    }
}
