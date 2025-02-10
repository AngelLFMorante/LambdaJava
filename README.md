# Proyecto: Introducción a Lambdas y Streams en Java 🚀

Este repositorio contiene un ejemplo práctico de cómo utilizar **Lambdas** y **Streams** en Java para manipular listas de datos de forma eficiente y declarativa.

## 📌 Descripción
Este programa filtra una lista de nombres, seleccionando aquellos que comienzan con la letra **'A'**, los convierte a **mayúsculas** y los imprime en la consola.

---

## 🔥 Tecnologías utilizadas
- **Java 8+** (Necesario para usar lambdas y streams)
- **Maven** *(Opcional, si decides empaquetar el proyecto)*
- **IntelliJ IDEA / Eclipse** *(Cualquier IDE compatible con Java)*

---

## 🚀 ¿Cómo ejecutar el proyecto?
### **1️⃣ Clonar el repositorio**
```sh
git clone https://github.com/tuusuario/lambdas-java.git
cd lambdas-java
```
### **2️⃣ Compilar y ejecutar**
Si tienes **Java 8+**, puedes ejecutar directamente:
```sh
javac -d out src/com/example/lambdas/LambdaStreamExamples.java
java -cp out com.example.lambdas.LambdaStreamExamples
```
O, si usas **Maven**, ejecuta:
```sh
mvn compile exec:java
```

---

## 📚 Explicación del código

### **1️⃣ Uso de Streams**
- **`filter(name -> name.startsWith("A"))`** → Filtra los nombres que comienzan con 'A'.
- **`map(String::toUpperCase)`** → Convierte cada nombre filtrado a mayúsculas.
- **`collect(Collectors.toList())`** → Recoge los resultados en una lista.
- **`forEach(System.out::println)`** → Imprime los nombres procesados.

### **2️⃣ ¿Por qué usar Lambdas y Streams?**
👉 Código más **conciso y legible**.  
👉 Evita bucles tradicionales (`for`), reduciendo errores.  
👉 Mejor rendimiento en procesamiento de datos con grandes volúmenes.

---

## 🎯 Posibles preguntas en entrevistas sobre Lambdas y Streams

1️⃣ **¿Qué es una expresión Lambda en Java?**
> Una función anónima que se puede pasar como argumento a un método.

2️⃣ **¿Qué beneficios aportan los Streams?**
> Permiten manipular datos de manera declarativa y optimizada.

3️⃣ **¿Cuál es la diferencia entre `map()` y `filter()` en Streams?**
> `map()` transforma datos, mientras que `filter()` los selecciona basándose en una condición.

4️⃣ **¿Los Streams modifican la lista original?**
> No, son inmutables. Siempre devuelven una nueva colección procesada.

5️⃣ **¿Cuál es la diferencia entre un Stream secuencial y uno paralelo?**
> El **secuencial** procesa los datos en orden, mientras que el **paralelo** usa múltiples núcleos para mayor rendimiento.

---

## 📌 Recursos adicionales
- 📚 [Documentación oficial de Java Streams](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
- 🎥 [Video explicativo sobre Lambdas](https://www.youtube.com/watch?v=Q1zvyuHvD2U)

📌 **Este ejemplo es ideal para entrevistas técnicas donde se requiera demostrar conocimientos en Java 8+ con Streams y Lambdas.** 🚀

---
### 👤 Autor
Desarrollado por Angel Lf Morante(https://github.com/AngelLFMorante)

