package main

import "fmt"

// Detalle de bajo nivel: cliente concreto de Stripe
type ClienteStripe struct {
	ClaveApi string
}

func (s *ClienteStripe) CobrarTarjeta(monto float64) bool {
	fmt.Printf("[API STRIPE] Enviando $%.2f con la clave %s\n", monto, s.ClaveApi)
	return true
}

// Detalle de bajo nivel: notificador concreto de SendGrid
type NotificadorSendgrid struct {
	CorreoRemitente string
}

func (n *NotificadorSendgrid) EnviarReciboCorreo(monto float64, correo string) {
	fmt.Printf("[API SENDGRID] Enviado desde %s a %s la cantidad de $%.2f\n", n.CorreoRemitente, correo, monto)
}

// Módulo de alto nivel que depende directamente de los detalles (viola DIP)
type ServicioPago struct {
	clienteStripe *ClienteStripe
	notificador   *NotificadorSendgrid
}

func NuevoServicioPago() *ServicioPago {
	return &ServicioPago{
		clienteStripe: &ClienteStripe{ClaveApi: "sk_test_123"},
		notificador:   &NotificadorSendgrid{CorreoRemitente: "pagos@tienda.com"},
	}
}

func (s *ServicioPago) ProcesarPago(monto float64, correo string) {
	if s.clienteStripe.CobrarTarjeta(monto) {
		s.notificador.EnviarReciboCorreo(monto, correo)
	}
}

func main() {
	servicio := NuevoServicioPago()
	servicio.ProcesarPago(1500.01, "changotremendo@gmail.com")
}
