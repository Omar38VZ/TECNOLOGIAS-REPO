from taco import Taco


class TacoSuadero(Taco):
    """Componente concreto: Taco de suadero."""

    def descripcion(self) -> str:
        return "Taco de suadero"

    def precio(self) -> float:
        return 20.0

    def calorias(self) -> int:
        return 210
