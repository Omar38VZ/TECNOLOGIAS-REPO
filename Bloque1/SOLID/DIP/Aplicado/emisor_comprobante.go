package main

type EmisorComprobante interface{ 
	E(correo string, monto float64) error
}