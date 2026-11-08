/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movimientodpunto;

/**
 *
 * @author valer
 */
public class Punt {

    private int x;
    private int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Movimiento horizontal
    public void derecha() {
        if (x < 19) {
            x++;
        }
    }

    public void izquierda() {
        if (x > 0) {
            x--;
        }
    }

    // Movimiento vertical
    public void arriba() {
        if (y < 19) {
            y++;
        }
    }

    public void abajo() {
        if (y > 0) {
            y--;
        }
    }
}