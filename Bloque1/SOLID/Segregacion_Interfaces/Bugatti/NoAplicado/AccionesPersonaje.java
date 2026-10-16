// Interfaz "gorda": obliga a todos los personajes a implementar acciones que no les corresponden.
public interface AccionesPersonaje { 
    void darGolpe(); 
    void pagarRenta();
    void cobrarRenta();
    void jugar();
    void llorar();
}
