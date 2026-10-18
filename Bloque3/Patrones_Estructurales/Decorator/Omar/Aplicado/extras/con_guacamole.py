from extras.extra_taco import ExtraTaco


class ConGuacamole(ExtraTaco):
    """Decorador concreto: agrega guacamole."""

    def descripcion(self) -> str:
        return self._taco.descripcion() + " + guacamole"

    def precio(self) -> float:
        return self._taco.precio() + 10

    def calorias(self) -> int:
        return self._taco.calorias() + 80
