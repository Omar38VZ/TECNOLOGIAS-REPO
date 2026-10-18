from extras.extra_taco import ExtraTaco


class ConPina(ExtraTaco):
    """Decorador concreto: agrega piña."""

    def descripcion(self) -> str:
        return self._taco.descripcion() + " + piña"

    def precio(self) -> float:
        return self._taco.precio() + 3

    def calorias(self) -> int:
        return self._taco.calorias() + 15
