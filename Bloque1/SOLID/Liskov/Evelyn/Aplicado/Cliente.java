public class Cliente {
    private String nombre;
    private String identificacion;
    private CuentaBancaria cuenta;

    public Cliente(String nombre, String identificacion, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void depositar(double cantidad) {
        cuenta.depositar(cantidad);
    }

    public void retirar(double cantidad) {
        cuenta.retirar(cantidad);
    }

    public double consultarSaldo() {
        return cuenta.consultarSaldo();
    }

    public double calcularIntereses() {
        return cuenta.calcularIntereses();
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Cuenta: " + cuenta.getNumeroCuenta());
    }
}
