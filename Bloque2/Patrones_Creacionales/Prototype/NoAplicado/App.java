import java.util.*;

public class App {
    public static void main(String[] args) {
        NucleoEnergia nucleoOriginal = NucleoEnergia.crearInicial();
        Motor motorOriginal = new Motor("Motor", 500, nucleoOriginal); 
        Nave original = new Nave("Interceptor", 100, motorOriginal, 
            new ArrayList<>(List.of(new Arma(60, "Laser"), new Arma(120, "Misil"), new Tripulacion("777","Ordis"));
        ))
        )
    }
}
