# Diagrama de clases · Decorator (Taquería El Patrón)

```mermaid
---
title: Patrón Decorator - Taquería El Patrón
---
classDiagram
    class Taco {
        <<abstract>>
        +descripcion()* str
        +precio()* float
        +calorias()* int
    }
    class TacoPastor {
        +descripcion() str
        +precio() float
        +calorias() int
    }
    class TacoSuadero {
        +descripcion() str
        +precio() float
        +calorias() int
    }
    class TacoBistec {
        +descripcion() str
        +precio() float
        +calorias() int
    }
    class ExtraTaco {
        #_taco: Taco
        +__init__(taco: Taco)
        +descripcion() str
        +precio() float
        +calorias() int
    }
    class ConQueso {
        +descripcion() str
        +precio() float
        +calorias() int
    }
    class ConGuacamole {
        +descripcion() str
        +precio() float
        +calorias() int
    }
    class ConPina {
        +descripcion() str
        +precio() float
        +calorias() int
    }
    class ConSalsaHabanera {
        +descripcion() str
        +precio() float
        +calorias() int
    }
    class ParaLlevar {
        +descripcion() str
        +precio() float
    }
    class DescuentoEstudiante {
        +descripcion() str
        +precio() float
    }
    class Pedido {
        -_cliente: str
        -_tacos: list~Taco~
        +__init__(cliente: str)
        +agregar(taco: Taco) None
        +esta_vacio() bool
        +aplicar_descuento_estudiante() None
        +total() float
        +imprimir_ticket() None
    }
    class Taqueria {
        -_menu_tacos: dict
        -_menu_extras: dict
        +__init__()
        +atender() None
        -_armar_taco() Taco
    }
    class main {
        <<módulo>>
        +main() None
    }

    Taco <|-- TacoPastor
    Taco <|-- TacoSuadero
    Taco <|-- TacoBistec
    Taco <|-- ExtraTaco
    ExtraTaco o--> "1" Taco : envuelve
    ExtraTaco <|-- ConQueso
    ExtraTaco <|-- ConGuacamole
    ExtraTaco <|-- ConPina
    ExtraTaco <|-- ConSalsaHabanera
    ExtraTaco <|-- ParaLlevar
    ExtraTaco <|-- DescuentoEstudiante
    Pedido o--> "0..*" Taco : contiene
    Pedido ..> DescuentoEstudiante : crea
    Taqueria ..> Pedido : crea
    Taqueria ..> Taco : arma y envuelve
    main ..> Taqueria : crea y usa
```

## Cómo leerlo

| Símbolo | Significado |
|---|---|
| `<<abstract>>` y métodos con `*` | Clase abstracta y métodos abstractos (`ABC` y `@abstractmethod`) |
| `+` / `-` / `#` | Público / privado / protegido (en Python, `_` al inicio indica "interno") |
| Flecha con triángulo hueco | Herencia: "es un" |
| Flecha con rombo hueco | Agregación: "tiene un" |
| Flecha punteada | Dependencia: "usa" o "crea" |

**Lo importante del patrón:** `ExtraTaco` **hereda** de `Taco` (es un Taco) y al mismo tiempo **tiene** un `Taco` adentro (`_taco`). Esa doble relación entre las mismas dos clases es la firma del Decorator.

`Taqueria._armar_taco()` devuelve `Taco | None` (un taco, o nada si la opción no fue válida).

`ParaLlevar` y `DescuentoEstudiante` no sobrescriben `calorias()`: usan la versión de `ExtraTaco`, que solo le pasa la pregunta al taco de adentro.
