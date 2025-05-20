# 🧠 Proyecto Java – Generics, Wildcards e Implementaciones Personalizadas

Este proyecto está dividido en cuatro partes y tiene como objetivo explorar los aspectos fundamentales de la programación genérica en Java. A través de distintos enfoques prácticos, se ilustra el uso de clases genéricas, `ArrayList`, wildcards, y la creación de estructuras propias como sorteadores y listas con límites genéricos.

---

## 📚 Tabla de Contenidos

- [Clases Genéricas y ArrayList](#-parte-1-clases-genéricas-y-arraylist)
- [Sorteador Genérico](#-parte-2-sorteador-genérico)
- [Wildcards en Genéricos](#-parte-3-wildcards-en-genéricos)
- [Conclusión y aprendizaje](#-parte-4-conclusión-y-aprendizaje)

---

## 🧩 Parte 1: Clases Genéricas y ArrayList

Esta sección introduce el concepto de *polimorfismo paramétrico* en Java, que permite diseñar clases y métodos que trabajan con distintos tipos de datos, garantizando seguridad en tiempo de compilación.

### ✨ Objetivo

Comprender cómo Java permite trabajar con tipos de datos genéricos a través de clases como `ArrayList` y cómo esto se traduce en mayor flexibilidad y reutilización del código.

### 📦 Conceptos clave

- Uso de `ArrayList<E>` donde `E` representa un tipo de dato genérico.
- Implementación y uso de métodos genéricos como `add(E e)` y `get(int index)`.
- Restricción de tipo mediante la declaración explícita del tipo en tiempo de compilación.

### ✅ Conclusión

Gracias a los genéricos, estructuras como `ArrayList` pueden adaptarse a cualquier tipo de objeto. Esto permite evitar errores de casting y mejorar la legibilidad y reutilización del código, trabajando con seguridad de tipos desde la compilación.

---

## 🧩 Parte 2: Sorteador Genérico

Esta parte demuestra la creación de una clase propia llamada `Sorteador<T>`, que permite almacenar elementos de cualquier tipo y obtenerlos de manera aleatoria.

### ✨ Objetivo

Implementar una colección genérica que permita:

- Agregar elementos de cualquier tipo.
- Obtener y eliminar elementos de forma aleatoria.
- Verificar si la colección está vacía.

### 📦 Clases involucradas

- **Sorteador<T>**: Clase genérica que encapsula un `ArrayList<T>` y usa `Random` para sortear elementos.
- **Club**: Representa clubes deportivos con nombre y país.
- **PaisSudamericano**: Enum que modela países de Sudamérica.

### ✅ Conclusión

El `Sorteador` muestra cómo crear estructuras de datos reutilizables gracias a la genericidad, aplicando los conceptos de listas genéricas y manipulación dinámica de elementos de cualquier tipo.

---

## 🧩 Parte 3: Wildcards en Genéricos

Esta sección aborda el uso de *wildcards* (`?`) para trabajar con colecciones de tipos relacionados por herencia, utilizando límites superiores e inferiores para permitir operaciones seguras y flexibles.

### ✨ Objetivo

Demostrar el uso de wildcards en métodos que manipulan listas, aplicando los principios:

- `? extends T`: Para listas de subtipos (lectura segura).
- `? super T`: Para listas de supertypos (escritura segura).
- `?`: Wildcard sin límite para métodos de solo lectura.

### 📦 Clases involucradas

- **Persona / Deportista / Futbolista**: Jerarquía de clases para ilustrar herencia.
- **Auto**: Clase independiente sin relación jerárquica.
- **UtilListas**: Clase de utilidad que implementa métodos con wildcards.

### ✅ Conclusión

Los wildcards permiten desarrollar métodos más flexibles sin comprometer la seguridad de tipos. Se basan en el principio PECS (Producer Extends, Consumer Super) para garantizar operaciones válidas tanto en lectura como en escritura, sin duplicar código.

---

## ✅ Parte 4: Conclusión y aprendizaje

Este proyecto cubre distintos aspectos fundamentales del uso de genéricos en Java:

- **Polimorfismo paramétrico** mediante el uso de clases como `ArrayList`.
- **Diseño de estructuras propias** como `Sorteador<T>`.
- **Uso de wildcards** para aplicar herencia en colecciones sin romper la seguridad de tipos.
- **Seguridad de compilación** gracias al uso de genéricos acotados y verificación de tipos en tiempo de compilación.

Estas herramientas son esenciales para escribir código más limpio, reutilizable y fácil de mantener, especialmente en proyectos con estructuras complejas y diversos tipos de datos.

---

> *Este repositorio es parte de ejemplos educativos sobre programación Java. Desarrollado con Java 8+ y orientado a estudiantes o desarrolladores que desean dominar los conceptos de generics en profundidad.*
