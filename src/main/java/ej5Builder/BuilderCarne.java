package ej5Builder;

public abstract class BuilderCarne {
    protected Carne carne;

    public Carne getProduct() {
        return carne;
    }

    public void createProduct() {
        this.carne = new Carne();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}
