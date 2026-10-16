public class Caja {
    public void cobrar(MetodoPago metodo, double monto){
        if(metodo.validar()){
            metodo.pagar(monto);
        } else {
            System.out.println("El metodo de pago no es valido");
        }
    }
}
