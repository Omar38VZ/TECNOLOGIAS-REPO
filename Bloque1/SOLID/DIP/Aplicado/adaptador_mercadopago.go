package main

import "fmt"

type AdaptadorMercadoPago struct { 
	TokenAcces string
}

func (mp *AdaptadorMercadoPago) Cobrar(monto float64) error { 
	fmt.Printf("[Mercado Pago] Cobro realizado por el monto de %.2f con el token %s\n", monto, mp.TokenAcces)
	return nil
}
