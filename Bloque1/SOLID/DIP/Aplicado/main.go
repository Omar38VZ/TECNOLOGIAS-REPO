package main

import "fmt"

func main() {
	fmt.Println("=== Entorno Real ===")

	pasarelaReal := &AdaptadorMercadoPago{TokenAccess: "fefdferbtbhfbveaojceq"}
	emisorReal := &AdaptadorTwilio{IdentificadorCuenta: "AC0120201025"}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	mostrarResultado(servicioReal.ProcesarPago("changotremendoyosoy@gmail.com", 555.0))

	fmt.Println("\n=== Entorno de Pruebas (Mock) ===")

	pasarelaMock := &SimuladorPasarela{DebeFallar: false}
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	mostrarResultado(servicioMock.ProcesarPago("changoTremendo@gmail.com", 150.0))

	fmt.Println("\n=== Entorno de Pruebas (Mock que falla) ===")

	servicioFalla := NuevoServicioPago(&SimuladorPasarela{DebeFallar: true}, emisorMock)
	mostrarResultado(servicioFalla.ProcesarPago("changoTremendo@gmail.com", 9999.0))
}

func mostrarResultado(err error) {
	if err != nil {
		fmt.Println("Pago rechazado:", err)
		return
	}
	fmt.Println("Pago procesado correctamente")
}
