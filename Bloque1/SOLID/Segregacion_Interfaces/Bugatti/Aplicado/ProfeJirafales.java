public class ProfeJirafales implements Educador, Habitante {
    private final String nombre = "Profesor Jirafales";

    @Override
    public void impartirClase() {
        System.out.println(nombre + ": Hoy veremos la historia de México");
    }

    @Override
    public void pasarLista() {
        System.out.println(nombre + ": Chavo, Quico, Ñoño, Popis...");
    }

    @Override
    public void hacerCoraje() {
        System.out.println(nombre + ": ¡Ta, ta, ta, taaa!");
    }

    @Override
    public void interactuarConElChavo() {
        System.out.println(nombre + ": Chavo, ¿hiciste la tarea?");
    }
}
