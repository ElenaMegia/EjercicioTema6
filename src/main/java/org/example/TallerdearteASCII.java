package org.example;

import java.util.Scanner;

public class TallerdearteASCII {
    Scanner teclado = new Scanner(System.in);
    private final int num_filas = 10;
    private final int num_columnas = 40;
    private final char vacio = '.';
    private char[][] tablero = new char[num_filas][num_columnas];

    public TallerdearteASCII() {
    }

    public void inicializarMarco() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                tablero[i][j] = vacio;
            }
        }
    }

    public void pintarCaracter() {
        int fila;
        int col;
        char pintura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la fila: ");
        fila = teclado.nextInt();
        System.out.println("Introduce la columna: ");
        col = teclado.nextInt();
        System.out.println("Introduce el caracter: ");
        pintura = teclado.next().charAt(0);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                if (fila == i && col == j) {
                    tablero[i][j] = pintura;
                }
            }
        }
    }

    public void pintarRectangulo() {
        int fila_1, col_1;
        int fila_2, col_2;
        char pintura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la fila de la esquina superior izquierda del rectángulo: ");
        fila_1 = teclado.nextInt();
        System.out.println("Introduce la columna de la esquina superior izquierda del rectángulo: ");
        col_1 = teclado.nextInt();
        System.out.println("Introduce la fila de la esquina inferior derecha del rectángulo: ");
        fila_2 = teclado.nextInt();
        System.out.println("Introduce la columna de la esquina inferior derecha del rectángulo: ");
        col_2 = teclado.nextInt();
        System.out.println("Introduce el caracter: ");
        pintura = teclado.next().charAt(0);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                if (fila_1 <= i && fila_2 >= i && col_1 <= j && col_2 >= j) {
                    tablero[i][j] = pintura;
                }
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
