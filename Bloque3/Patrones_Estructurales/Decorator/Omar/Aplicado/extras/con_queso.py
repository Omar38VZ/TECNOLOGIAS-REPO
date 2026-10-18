from extras.extra_taco import ExtraTaco


class ConQueso(ExtraTaco):
    """Decorador concreto: agrega queso."""

    def descripcion(self) -> str:
        return self._taco.descripcion() + " + queso"

    def precio(self) -> float:
        return self._taco.precio() + 7

    def calorias(self) -> int:
        return self._taco.calorias() + 90
