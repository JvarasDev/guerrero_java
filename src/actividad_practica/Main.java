package actividad_practica;


public class Main {


    public static void main(String[] args) {
            // Crear espadas
        Espada espada1 = new Espada("Caliburn", 9);
        Espada espada2 = new Espada("Excalibur", 15);
        
        // Crear escudos
        Escudo escudo1 = new Escudo("Escudo de Acero", 8);
        Escudo escudo2 = new Escudo("Broquel", 5);
        
        
        Guerrero guerrero1 = new Guerrero("Arturo", 100, 20, null, null);
        Guerrero guerrero2 = new Guerrero("Lancelot", 90, 25, null, null);
        
        
        System.out.println("=== Estado de Inicio ===");
        guerrero1.mostrarEstado();
        
        guerrero1.equipar_espada(espada1);
        guerrero1.equipar_escudo(escudo1);
        
        System.out.println("\n=== Despues de equipar ===");
        guerrero1.mostrarEstado();
        
        
        guerrero2.equipar_espada(espada2);
        
        
        System.out.println("\n=== Guerrero - 2 ===");
        guerrero2.mostrarEstado();
        
    }
    
}
