package main  

func main(){
	fmt.Println("=== Entrono Real ===")

	pasarelaReal := &AdaptadorMercadoPago{TokenAccess: "fefdferbtbhfbveaojceq"}
	emisorReal := &AdaptadorTwilio{IdentificadorCuenta: "AC0120201025"}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	_ = servicioReal.ProcesarPago("changotremendoyosoy@gmal.com", 555.0)

	fmt.Println("\n=== Entrono de Pruebas (Moq) ===")

	pasarelaMock := &SimuladorPasarela{ DebeFallar: false }
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	_ = servicioMock.ProcesarPago("changoTremendo@gmail.com", 150.0)

}