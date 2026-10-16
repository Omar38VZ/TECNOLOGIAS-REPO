public class App { 
    public static void main (String[] args) throws Exception {
        Bebida[] bebidas = { 
            new Agua("CIEL", 20),
            new Refresco("Coca", 25),
            new Tepache("Tepache", 25),
            new Cerveza("Coronita", 30)
        };
        Caja caja = new Caja(); 
        caja.cobrar(bebidas, new DescuentoNavidad(), 200);
    }
}
