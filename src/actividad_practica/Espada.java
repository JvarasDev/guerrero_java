/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_practica;

/**
 *
 * @author juanm
 */
public class Espada {
    private String nombre;
    private int puntos_ataque;

    public Espada(String nombre, int puntos_ataque) {
        this.nombre = nombre;
        this.puntos_ataque = puntos_ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos_ataque() {
        return puntos_ataque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos_ataque(int puntos_ataque) {
        this.puntos_ataque = puntos_ataque;
    }

    @Override
    public String toString() {
        return "Espada{" + "nombre=" + nombre + ", puntos_ataque=" + puntos_ataque + '}';
    }
    
      public static void main(String[] args) {
        Espada espada1 = new Espada("Caliburn", 9);
        System.out.println(espada1);
    }
}
