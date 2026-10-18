from extras.extra_taco import ExtraTaco


class ParaLlevar(ExtraTaco):
    """Decorador concreto: cobra el empaque. No cambia las calorías, así que no sobrescribe calorias()."""

    def descripcion(self) -> str:
        return self._taco.descripcion() + " (para llevar)"

    def precio(self) -> float:
        return self._taco.precio() + 5
