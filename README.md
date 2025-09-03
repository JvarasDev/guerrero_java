# ⚔️ Sistema de Guerreros RPG

Un sistema de combate orientado a objetos desarrollado en Java que simula guerreros medievales con equipamiento personalizable.

## 🎮 Características

- **Sistema de Guerreros**: Crea personajes con estadísticas base personalizables
- **Equipamiento Dinámico**: Equipa espadas y escudos que modifican las estadísticas
- **Cálculos Automáticos**: Las estadísticas totales se calculan automáticamente
- **Estado Detallado**: Visualiza toda la información del guerrero de forma organizada

## 🏗️ Estructura del Proyecto

```
actividad_practica/
├── Guerrero.java    # Clase principal del guerrero
├── Espada.java      # Clase de armas ofensivas
├── Escudo.java      # Clase de equipamiento defensivo
└── Main.java        # Punto de entrada y pruebas
```

## 📋 Clases

### 🛡️ Guerrero
La clase principal que representa un personaje de combate.

**Atributos:**
- `nombre`: Identificador del guerrero
- `puntos_vida`: Puntos de vida base
- `puntos_ataque`: Puntos de ataque base
- `espada`: Arma equipada (opcional)
- `escudo`: Protección equipada (opcional)

**Métodos principales:**
- `equipar_espada(Espada e)`: Equipa un arma
- `equipar_escudo(Escudo s)`: Equipa protección
- `getPuntosAtaqueTotales()`: Calcula ataque total (base + espada)
- `getPuntosVidaTotales()`: Calcula vida total (base + defensa escudo)
- `mostrarEstado()`: Muestra información completa del guerrero

### ⚔️ Espada
Representa las armas ofensivas del juego.

**Atributos:**
- `nombre`: Nombre del arma
- `puntos_ataque`: Bonus de ataque que proporciona

### 🛡️ Escudo
Representa el equipamiento defensivo.

**Atributos:**
- `nombre`: Nombre del escudo
- `puntos_defensa`: Bonus de defensa que se suma a la vida

## 🚀 Uso

### Crear un Guerrero
```java
Guerrero guerrero = new Guerrero("Arturo", 100, 20, null, null);
```

### Crear Equipamiento
```java
Espada excalibur = new Espada("Excalibur", 15);
Escudo escudoAcero = new Escudo("Escudo de Acero", 8);
```

### Equipar al Guerrero
```java
guerrero.equipar_espada(excalibur);
guerrero.equipar_escudo(escudoAcero);
```

### Mostrar Estado
```java
guerrero.mostrarEstado();
```

## 📊 Sistema de Estadísticas

- **Ataque Total** = Ataque Base + Ataque de Espada (si tiene)
- **Vida Total** = Vida Base + Defensa de Escudo (si tiene)
- Los guerreros pueden combatir sin equipamiento usando solo sus estadísticas base

## 🎯 Ejemplo de Ejecución

```
=== ESTADO INICIAL ===
Nombre: Arturo
Puntos de vida totales: 100
Puntos de ataque totales: 20
Espada: Sin equipar
Escudo: Sin equipar

=== DESPUÉS DE EQUIPAR ===
Nombre: Arturo
Puntos de vida totales: 108
Puntos de ataque totales: 35
Espada: Excalibur
Escudo: Escudo de Acero
```

## 🔧 Requisitos

- Java 8 o superior
- IDE compatible con Java (Eclipse, IntelliJ IDEA, VS Code, etc.)

## 📝 Instalación y Ejecución

1. Clona o descarga el proyecto
2. Abre el proyecto en tu IDE preferido
3. Compila todas las clases Java
4. Ejecuta la clase `Main` para ver el sistema en funcionamiento

## 🎮 Posibles Extensiones

- Sistema de combate entre guerreros
- Más tipos de equipamiento (armaduras, anillos, etc.)
- Sistema de experiencia y niveles
- Inventario de múltiples objetos
- Efectos especiales de equipamiento

---

## 👨‍💻 Desarrollador

**Desarrollado por [jvarasdev](https://github.com/jvarasdev)**

---

*Sistema desarrollado como práctica de Programación Orientada a Objetos en Java*
