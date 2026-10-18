from taco import Taco


class ExtraTaco(Taco):
    """Decorador base: ES un Taco y TIENE un Taco adentro. Por defecto solo le pasa todo."""

    def __init__(self, taco: Taco):
        self._taco = taco

    def descripcion(self) -> str:
        return self._taco.descripcion()

    def precio(self) -> float:
        return self._taco.precio()

    def calorias(self) -> int:
        return self._taco.calorias()
