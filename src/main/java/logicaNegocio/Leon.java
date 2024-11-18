package logicaNegocio;

public abstract class Leon extends Animal {
    // TODO: Aquí va tu código
       public Leon() {
        this.habitat = TipoHabitat.TERRESTRE;
    }
 
    @Override
    public String emitirSonido() {
        return "Rugido";
    }
 
    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }
 
    public TipoHabitat getHabitat() {
        return habitat;
    }
}
 
 
