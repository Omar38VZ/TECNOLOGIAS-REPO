class DispositivoElectronico:
    """Clase Padre que define el comportamiento básico de cualquier dispositivo."""
    
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.estado = False  # Apagado por defecto

    def encender(self):
        self.estado = True

    def apagar(self):
        self.estado = False

    def estado_actual(self):
        return "Encendido" if self.estado else "Apagado"

class FocoInteligente(DispositivoElectronico):
    """Clase Hija que hereda de DispositivoElectronico (Herencia Simple)."""
    
    def __init__(self, marca, modelo, color_inicial="Blanco"):
        super().__init__(marca, modelo) 
        self.color = color_inicial

    def cambiar_color(self, nuevo_color):
        # Lógica mejorada: Solo cambia de color si está encendido
        if self.estado:
            self.color = nuevo_color
            return True
        return False
