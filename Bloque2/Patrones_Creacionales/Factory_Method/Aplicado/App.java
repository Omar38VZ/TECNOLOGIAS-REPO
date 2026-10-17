public class App {
    public static void main(String[] args) {
        // El cliente solo conoce Nivel; cada nivel decide qué enemigo crear
        Nivel[] niveles = { new NivelBosque(), new NivelCastillo(), new NivelVolcan() };

        for (Nivel nivel : niveles) {
            nivel.jugar();
        }
    }
}
