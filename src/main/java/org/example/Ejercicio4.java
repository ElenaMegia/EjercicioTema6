package org.example;

import java.util.Scanner;

public class Ejercicio4 {
Scanner teclado = new Scanner(System.in);
    private static int inicio = 0;
    static Ovejas juego = new Ovejas();

    public void Ejercicio4metodo() {
        juego.iniciarTablero();
        juego.mostrarTablero(inicio);

        do {
            juego.moverPeon();
            juego.mostrarTablero(inicio);
        } while (!juego.hasGanado() && !juego.getTerminar());
    }

}
