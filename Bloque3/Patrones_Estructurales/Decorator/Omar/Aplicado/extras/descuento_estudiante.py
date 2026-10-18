from extras.extra_taco import ExtraTaco


class DescuentoEstudiante(ExtraTaco):
    """Decorador concreto: no suma, multiplica. Un decorador también puede modificar el resultado."""

    def descripcion(self) -> str:
        return self._taco.descripcion() + " (-10% estudiante)"

    def precio(self) -> float:
        return self._taco.precio() * 0.90
