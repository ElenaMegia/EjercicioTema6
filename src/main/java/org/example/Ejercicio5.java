package org.example;

import java.util.Scanner;

public class Ejercicio5 extends TallerdearteASCII {

    TallerdearteASCII ASCII = new TallerdearteASCII();
    int opcion;

    public void arteASCII() {
        ASCII.inicializarMarco();
        ASCII.mostrarTablero();

        do {
            menu();
            System.out.println("¿Que quieres hacer?");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ASCII.pintarCaracter();
                    ASCII.mostrarTablero();
                    break;
                case 2:
                    ASCII.pintarRectangulo();
                    ASCII.mostrarTablero();
                    break;
                case 3:
                    System.out.println("Gracias.");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion != 3);
        teclado.nextLine();
    }

    public void menu() {
        System.out.println("1 - Pintar un caracter");
        System.out.println("2 - Pintar un rectángulo");
        System.out.println("3 - Salir");
    }
    //Creame el metodo main

}