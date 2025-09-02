package actividad_practica;
import java.util.Scanner;

public class Guerrero {
    
    private String nombre;
    private int puntos_vida;
    private int puntos_ataque;
    private Espada  espada;
    private Escudo escudo;


    public Guerrero(String nombre, int puntos_vida, int puntos_ataque, Espada espada, Escudo escudo) {
        this.nombre = nombre;
        this.puntos_vida = puntos_vida;
        this.puntos_ataque = puntos_ataque;
        this.espada = espada;
        this.escudo = escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos_vida() {
        return puntos_vida;
    }

    public int getPuntos_ataque() {
        return puntos_ataque;
    }

    public Espada getEspada() {
        return espada;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos_vida(int puntos_vida) {
        this.puntos_vida = puntos_vida;
    }

    public void setPuntos_ataque(int puntos_ataque) {
        this.puntos_ataque = puntos_ataque;
    }

    public void setEspada(Espada espada) {
        this.espada = espada;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public void equipar_espada(Espada e){
        this.espada = e;
       
    }
    public void equipar_escudo(Escudo e){
        this.escudo = e;
       
    }
    
  public int getPuntosAtaqueTotales() {  
      if (espada == null) {
        return puntos_ataque;  // Solo puntos base, sin imprimir
    } else {
        return puntos_ataque + espada.getPuntos_ataque();  // Base + ataque de espada
    }
}
  public int puntos_vida_totales(){
      return puntos_vida + escudo.getPuntos_defensa();
      
  }
  
  public void mostrar_estado(){
      
    
}
    
}
    

