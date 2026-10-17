public class App {
    public static void main(String[] args) {
        // El cliente tiene que conocer los números mágicos de cada nivel
        int[] tipos = { 1, 2, 3, 4 };

        for (int tipo : tipos) {
            Nivel nivel = new Nivel(tipo);
            nivel.jugar();
        }
    }
}
