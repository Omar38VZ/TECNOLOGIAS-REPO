package main

type EmisorComprobante interface {
	EmitirComprobante(correo string, monto float64) error
}
