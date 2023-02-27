package org.example;

import java.util.Scanner;
public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);


    public void Ejercicio2metodo() {
        char[][] tabla = new char[4][4];
        int fila = (int) (Math.random() * 4);
        int columna = (int) (Math.random() * 4);

        inicializarTablero(tabla);
        mostrarTablero(tabla);

        do {
            System.out.println("¿Qué columna?");
            int columnaUsuario = introducirEnteroEntreLimites(1, 4) - 1;
            System.out.println("¿Qué fila?");
            int filaUsuario = introducirEnteroEntreLimites(1, 4) - 1;

            if (disparar(tabla, filaUsuario, columnaUsuario, fila, columna)) {
                System.out.println("Tocado y hundido");
            } else {
                System.out.println("Agua");
            }

            mostrarTablero(tabla);

        } while (!juegoTerminado(tabla));

        System.out.println("Ha ganado");
    }

    public static void inicializarTablero(char[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = '?';
            }
        }
    }

    public static void mostrarTablero(char[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int introducirEnteroEntreLimites(int min, int max) {
        int num;
        do {
            System.out.print("Introduzca un número entre " + min + " y " + max + ": ");
            num = sc.nextInt();
        } while (num < min || num > max);
        return num;
    }

    public static boolean disparar(char[][] tabla, int filaUsuario, int columnaUsuario, int filaBarco, int columnaBarco) {
        boolean tocado=false;
        if (filaUsuario == filaBarco && columnaUsuario == columnaBarco) {
            tabla[filaUsuario][columnaUsuario] = 'X';
            tocado= true;
        } else {
            tabla[filaUsuario][columnaUsuario] = '~';
            tocado= false;
        }
        return tocado;
    }

    public static boolean juegoTerminado(char[][] tabla) {
        boolean terminado=false;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if(tabla[i][j]=='X'){
                    terminado=true;
                }
            }
        }
        return terminado;
    }
}
