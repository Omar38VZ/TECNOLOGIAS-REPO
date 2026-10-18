from taco import Taco


class TacoPastor(Taco):
    """Componente concreto: Taco de pastor."""

    def descripcion(self) -> str:
        return "Taco de pastor"

    def precio(self) -> float:
        return 18.0

    def calorias(self) -> int:
        return 180
