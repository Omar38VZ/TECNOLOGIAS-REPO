public abstract class Bebida {
    protected static final double IVA = 0.16; 
    private final String nombreBebida; 
    private final Etiqueta etiqueta;
    private final double precioBase; 

    protected Bebida(String nombreBebida, Etiqueta etiqueta, double precioBase){
        if(precioBase <= 0) {
            throw new IllegalArgumentException("Precio Invalido");
        } 
        this.nombreBebida = nombreBebida; 
        this.etiqueta = etiqueta; 
        this.precioBase = precioBase; 
    }

    public abstract boolean requiereINE();
    public abstract double calcularTotal();
    
    public double getPrecioBase() { 
        return precioBase; 
    }

    public String getNombreBebida() { 
        return nombreBebida; 
    }

    public Etiqueta getEtiqueta() { 
        return etiqueta; 
    }
}
