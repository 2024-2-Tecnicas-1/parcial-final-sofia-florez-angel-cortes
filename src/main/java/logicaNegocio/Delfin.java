package logicaNegocio;

public class Delfin extends Animal {

    // TODO: Aquí va tu código
    private TipoHabitat habitat;
    public Delfin() {
    this.habitat = TipoHabitat.ACUATICO;
    }

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }
}
