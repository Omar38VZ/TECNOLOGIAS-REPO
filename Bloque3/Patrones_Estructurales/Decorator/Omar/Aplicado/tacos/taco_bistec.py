from taco import Taco


class TacoBistec(Taco):
    """Componente concreto: Taco de bistec."""

    def descripcion(self) -> str:
        return "Taco de bistec"

    def precio(self) -> float:
        return 22.0

    def calorias(self) -> int:
        return 200
