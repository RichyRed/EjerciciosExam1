package ej5Builder;

public class Lomito extends BuilderCarne{
    @Override
    public void buildTipoDeCarne() {
        carne.setTipoDeCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        carne.setSaborRefresco("MinerAgua");
    }

    @Override
    public void buildGuarniciones() {
        carne.setGuarniciones("Spaggetti");
    }
}
