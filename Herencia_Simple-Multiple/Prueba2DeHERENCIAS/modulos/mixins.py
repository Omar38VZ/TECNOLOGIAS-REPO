import random

class ConexionWiFi:
    """Módulo para darle conexión a internet a un dispositivo."""
    
    def __init__(self):
        self.red_conectada = None
        self.ip = None

    def conectar(self, red):
        self.red_conectada = red
        self.ip = f"192.168.1.{random.randint(10, 200)}"

    def desconectar(self):
        self.red_conectada = None
        self.ip = None

class BateriaRecargable:
    """Módulo para que el dispositivo funcione sin cables."""
    
    def __init__(self, nivel_bateria=100):
        self.nivel_bateria = nivel_bateria

    def cargar_bateria(self):
        self.nivel_bateria = 100
        
    def consumir_bateria(self, cantidad=2):
        """Método nuevo para descargar la batería poco a poco."""
        if self.nivel_bateria > 0:
            self.nivel_bateria -= cantidad
        if self.nivel_bateria <= 0:
            self.nivel_bateria = 0

class SensorMovimiento:
    """Módulo para detectar presencia."""
    
    def detectar_movimiento(self):
        # Más probabilidad de 'False' para que no brinque a cada rato
        return random.choice([True, False, False, False])
