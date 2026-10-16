public class SistemaBancario {
    public static void main(String[] args) {
        // Ejemplo de uso que evidencia la violación del principio LSP
        
        System.out.println("---Sistema bancario LSP NO APLICADO---");
        CuentaAhorro ahorro = new CuentaAhorro("AH-123", 1000);
        Cliente cliente1 = new Cliente("Evelyn", "ID001", ahorro);
        
        System.out.println("Intentando pagar deuda en cuenta de ahorro...");
        try {
            cliente1.pagarDeuda(50);
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción (Violación LSP): " + e.getMessage());
        }
        
        CuentaCredito credito = new CuentaCredito("CR-456", 5000);
        Cliente cliente2 = new Cliente("Omar", "ID002", credito);
        
        System.out.println("\nRetirando (usando crédito) de cuenta de crédito...");
        cliente2.retirar(1000);
        System.out.println("Deuda actual: " + credito.consultarDeuda());
        
        System.out.println("Pagando deuda en cuenta de crédito...");
        cliente2.pagarDeuda(500);
        System.out.println("Deuda actual: " + credito.consultarDeuda());

        // El mismo código con cada subclase: solo funciona con CuentaCredito
        System.out.println("\nPagando $100 de deuda con cada tipo de cuenta...");
        CuentaBancaria[] cuentas = {
            new CuentaAhorro("AH-789", 500),
            new CuentaCorriente("CC-101", 500, 200),
            new CuentaCredito("CR-202", 1000)
        };
        for (CuentaBancaria cuenta : cuentas) {
            try {
                cuenta.pagarDeuda(100);
                System.out.println(cuenta.getNumeroCuenta() + ": pago aplicado");
            } catch (UnsupportedOperationException e) {
                System.out.println(cuenta.getNumeroCuenta() + ": FALLA -> " + e.getMessage());
            }
        }
    }
}
