from abc import ABC, abstractmethod


class Taco(ABC):
    """Componente: lo que todo taco debe saber responder."""

    @abstractmethod
    def descripcion(self) -> str:
        pass

    @abstractmethod
    def precio(self) -> float:
        pass

    @abstractmethod
    def calorias(self) -> int:
        pass
