package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Pide al usuario que ingrese el valor mínimo

        int min = 0;
        boolean minValido = false;
        while (!minValido) {
            System.out.println("Ingrese el valor mínimo:");
            try {
                min = sc.nextInt();
                minValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero.");
                sc.nextLine();
            }
        }

        // Pide al usuario que ingrese el valor máximo

        int max = 0;
        boolean maxValido = false;
        while (!maxValido) {
            System.out.println("Ingrese el valor máximo:");
            try {
                max = sc.nextInt();
                maxValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero.");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        int[] tabla = crearTabla(min, max);
        int maximo = encontrarMaximo(tabla);
        System.out.println("La tabla es: ");
        mostrarTabla(tabla);
        System.out.println("El máximo valor en la tabla es: " + maximo);

    }

    public static int[] crearTabla(int min, int max) {
        int[] tabla = new int[10];
        Random rand = new Random();
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rand.nextInt((max - min) + 1) + min;
        }
        return tabla;
    }

    public static int encontrarMaximo(int[] tabla) {
        int maximo = tabla[0];
        for (int i = 1; i < tabla.length; i++) {
            if (tabla[i] > maximo) {
                maximo = tabla[i];
            }
        }
        return maximo;
    }

    public static void mostrarTabla(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();
    }


}
