package com.example.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamExamples {
    public static void main(String[] args) {
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
