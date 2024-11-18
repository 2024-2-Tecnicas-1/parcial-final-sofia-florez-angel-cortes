package logicaNegocio;

public class Zoologico {
    public static void main (String[]args){
        Leon leon = new Leon();
        Delfin delfin = new Delfin();
        Perro perro = new Perro();
        
        System.out.println("Leon:");
        System.out.println("Sonido " + leon.emitirSonido());
        System.out.println("Dieta " + leon.obtenerDieta());
        System.out.println("Habitad " + leon.getHabitat());
        
        System.out.println("Delfin:");
        System.out.println("sonido " + delfin.emitirSonido());
        System.out.println("Dieta " + delfin.obtenerDieta());
        System.out.println("Habitad " + delfin.getHabitat());
        
        System.out.println("Perro:");
        System.out.println("Sonido " + perro.emitirSonido());
        System.out.println("Dieta " + perro.obtenerDieta());
        System.out.println("Habitad " + perro.getHabitat());
        System.out.println("Interaccion con humanos " + perro.interactuarConHumano());
        
        
    }
}
 