public class App {
    public static void main(String[] args) { 
        AccionesPersonaje[] personajes = { new DonRamon(), new DonaFlorinda(), new Nono() };

        System.out.println("---La vecindad del Chavo (ISP NO aplicado)---");

        // Cada personaje está obligado a tener las 5 acciones, aunque no le correspondan
        for (AccionesPersonaje personaje : personajes) {
            ejecutar(personaje::darGolpe);
            ejecutar(personaje::pagarRenta);
            ejecutar(personaje::cobrarRenta);
            ejecutar(personaje::jugar);
            ejecutar(personaje::llorar);
            System.out.println();
        }
    }

    private static void ejecutar(Runnable accion) {
        try {
            accion.run();
        } catch (UnsupportedOperationException e) {
            System.out.println("  [No implementado] " + e.getMessage());
        }
    }
}
