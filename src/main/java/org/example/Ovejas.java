package org.example;
import java.util.Scanner;
public class Ovejas {
static Scanner sc = new Scanner(System.in);
    private char[] tablero = new char[7];
    private final char izq = '>';
    private final char der = '<';
    private final char esp = ' ';
    private boolean terminar;

    public void iniciarTablero() {
        tablero[0] = izq;
        tablero[1] = izq;
        tablero[2] = izq;
        tablero[3] = esp;
        tablero[4] = der;
        tablero[5] = der;
        tablero[6] = der;
    }

    public boolean getTerminar() {
        return this.terminar;
    }

    public void mostrarTablero(int tamaño) {
        if (tamaño == 7) {
            System.out.println("\n-----------------------");
        } else {
            System.out.print(tablero[tamaño++] + " ");
            mostrarTablero(tamaño++);
        }
    }

    public void moverPeon() {
        System.out.println("Qué peón quieres mover? (-1 para salir)");
        int mov = sc.nextInt();
        if (mov == -1) {
            terminar = true;
            System.out.println("¡Gracias por jugar!");
        } else {
            int saltoDer = mov + 2;
            int saltoIzq = mov - 2;

            switch (tablero[mov]) {

                case izq:
                    if (tablero[mov + 1] == esp) {
                        tablero[mov] = esp;
                        tablero[mov + 1] = izq;
                    } else if (tablero[mov + 1] == der && tablero[saltoDer] == esp) {
                        tablero[mov] = esp;
                        tablero[mov + 2] = izq;
                    }
                    break;
                case der:
                    if (tablero[mov - 1] == esp) {
                        tablero[mov] = esp;
                        tablero[mov - 1] = der;
                    } else if (tablero[mov - 1] == izq && tablero[saltoIzq] == esp) {
                        tablero[mov] = esp;
                        tablero[mov - 2] = der;
                    }
                    break;
                case esp:
                    System.out.println("No es un peón");
                    break;
            }
        }
    }

    public boolean hasGanado() {
        if (tablero[0] == der && tablero[1] == der && tablero[2] == der && tablero[3] == esp && tablero[4] == izq
                && tablero[5] == izq && tablero[6] == izq) {
            return true;
        }
        return false;
    }
}
