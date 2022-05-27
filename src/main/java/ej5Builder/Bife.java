package ej5Builder;

public class Bife extends BuilderCarne{
    @Override
    public void buildTipoDeCarne() {
        carne.setTipoDeCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        carne.setSaborRefresco("Fanta");
    }

    @Override
    public void buildGuarniciones() {
        carne.setGuarniciones("Arrozz");
    }
}