public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("---Sistema bancario LSP APLICADO---");

        // Cualquier subclase sustituye a CuentaBancaria sin romper nada
        CuentaBancaria[] cuentas = {
            new CuentaAhorro("AH-123", 1000),
            new CuentaCorriente("CC-101", 500, 200),
            new CuentaCredito("CR-456", 5000)
        };
        for (CuentaBancaria cuenta : cuentas) {
            probarCuenta(cuenta);
        }

        // Las operaciones de crédito solo existen donde tienen sentido
        System.out.println("\n---Operaciones de crédito---");
        CuentaCredito credito = new CuentaCredito("CR-789", 5000);
        Cliente cliente = new Cliente("Omar", "ID002", credito);
        cliente.mostrarInformacion();

        cliente.retirar(1000);
        System.out.println("Deuda actual: " + credito.consultarDeuda());
        credito.pagarDeuda(500);
        System.out.println("Deuda actual: " + credito.consultarDeuda());
        System.out.println("Crédito disponible: " + credito.consultarCreditoDisponible());
    }

    public static void probarCuenta(CuentaBancaria cuenta) {
        cuenta.depositar(100);
        cuenta.retirar(50);
        System.out.println(cuenta.getNumeroCuenta() + " -> saldo: " + cuenta.consultarSaldo()
                + " | intereses: " + cuenta.calcularIntereses());
    }
}
