package com.example.lambdas;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase de ejemplo que demuestra el uso de Streams y expresiones Lambda en Java.
 * <p>
 * Este ejemplo filtra una lista de nombres, seleccionando aquellos que comienzan con 'A',
 * los convierte a mayúsculas y los imprime.
 * </p>
 *
 * <h2>Características:</h2>
 * <ul>
 *   <li>Uso de Streams para manipulación de colecciones.</li>
 *   <li>Filtrado con `filter()`.</li>
 *   <li>Transformación con `map()`.</li>
 *   <li>Uso de `collect()` para recolectar los resultados.</li>
 * </ul>
 *
 * @author TuNombre
 */
public class LambdaStreamExamples {

    /**
     * Método principal que ejecuta el ejemplo de Streams y Lambdas.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Lista de nombres de ejemplo
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        // Uso de Streams y Lambdas para filtrar y transformar datos
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A")) // Filtra nombres que comiencen con 'A'
                .map(String::toUpperCase) // Convierte a mayúsculas
                .collect(Collectors.toList());

        // Imprimir resultado
        filteredNames.forEach(System.out::println);
    }
}
