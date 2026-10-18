from extras.extra_taco import ExtraTaco


class ConSalsaHabanera(ExtraTaco):
    """Decorador concreto: agrega salsa habanera."""

    def descripcion(self) -> str:
        return self._taco.descripcion() + " + salsa habanera"

    def precio(self) -> float:
        return self._taco.precio() + 2

    def calorias(self) -> int:
        return self._taco.calorias() + 5
