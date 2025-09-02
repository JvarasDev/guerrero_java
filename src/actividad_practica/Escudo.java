package actividad_practica;

public class Escudo {
    private String nombre;
    private int puntos_defensa;

    public Escudo(String nombre, int puntos_defensa) {
        this.nombre = nombre;
        this.puntos_defensa = puntos_defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos_defensa() {
        return puntos_defensa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos_defensa(int puntos_defensa) {
        this.puntos_defensa = puntos_defensa;
    }

    @Override
    public String toString() {
        return "Escudo{" + "nombre=" + nombre + ", puntos_defensa=" + puntos_defensa + '}';
    }
    
    
    
    
    
}
