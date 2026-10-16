package main

import ("fmt"
		"errors"
)

type SimuladorPasarela struct{ 
	DebeFallar bool
}

func (sp *SimuladorPasarela) Cobrar(monto float64) error{ 
	if sp.DebeFallar {
		return errors.new("Fondos insuficientes")
	}
	
	fmt.Printf("Cobro relaizado por el monto de %.2f", monto)
	return nil
}

type SimuladorEmisor struct{}

func (se *SimuladorEmisor) Enviar(correo string, monto float64) error { 
	fmt.Printf("[Simulador] Comprobante enviado al correo %s, por el monto de %.2f \n", correo, monto)
	return nil
}