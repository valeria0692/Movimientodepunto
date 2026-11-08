/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movimientodpunto;
import java.util.Scanner;
/**
 *
 * @author valer
 */

public class Matriz {

    private static final int tam = 20;
    private final char[][] matriz = new char[tam][tam];
    private final Punt punt = new Punt(0, 0);

    public void mostrarMatriz() {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print((j == punt.getX() && i == (19 - punt.getY()) ? "*" : ".") + " ");
            }
            System.out.println();
        }
        System.out.println("Posicion X: " + punt.getX());
        System.out.println("Posicion Y: " + punt.getY());
    }

    public void moverP(char movimiento) {
        switch (Character.toUpperCase(movimiento)) {
            case '1' -> punt.arriba();
            case '2' -> punt.abajo();
            case '3' -> punt.izquierda();
            case '4' -> punt.derecha();
            default -> System.out.println("No se puede realizar este movimiento.");
        }
    }

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Matriz tablero = new Matriz();
            char mvimiento;

            do {
                System.out.println("\nElige una opcion de movimiento :");
                System.out.println("1 - Arriba\n2 - Abajo\n3 - Izquierda\n4 - Derecha\n5 - Salir");
                System.out.print("\nElige un movimiento: ");
                mvimiento = entrada.next().charAt(0);

                if (Character.toUpperCase(mvimiento) != '5') {
                    tablero.moverP(mvimiento);
                    tablero.mostrarMatriz();
                }
            } while (Character.toUpperCase(mvimiento) != '5');
        }
    }
}