package main

import "fmt"

// Módulo de alto nivel: depende solo de abstracciones (interfaces)
type ServicioPago struct {
	pasarela PasarelaPago
	emisor   EmisorComprobante
}

func NuevoServicioPago(pasarela PasarelaPago, emisor EmisorComprobante) *ServicioPago {
	return &ServicioPago{
		pasarela: pasarela,
		emisor:   emisor,
	}
}

func (sp *ServicioPago) ProcesarPago(correo string, monto float64) error {
	if err := sp.pasarela.Cobrar(monto); err != nil {
		return fmt.Errorf("error al cobrar: %w", err)
	}

	if err := sp.emisor.EmitirComprobante(correo, monto); err != nil {
		return fmt.Errorf("error al emitir comprobante: %w", err)
	}
	return nil
}
