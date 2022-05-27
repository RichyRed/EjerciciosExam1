package ej5Builder;

public class Tira extends BuilderCarne{
    @Override
    public void buildTipoDeCarne() {
        carne.setTipoDeCarne("Tira de carne");
    }

    @Override
    public void buildSaborRefresco() {
        carne.setSaborRefresco("Red Bull");
    }

    @Override
    public void buildGuarniciones() {
        carne.setGuarniciones("Papitas");
    }
}
