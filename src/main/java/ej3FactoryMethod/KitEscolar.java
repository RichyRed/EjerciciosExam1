package ej3FactoryMethod;

public class KitEscolar implements IProducto {
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public KitEscolar(Mochila mochila, Deportivo deportivo, Cuaderno cuaderno) {
        this.mochila = mochila;
        this.deportivo = deportivo;
        this.cuaderno = cuaderno;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void showInfo() {
        System.out.println("Kit escolar");
        System.out.println("Mochila: ");
        System.out.println("Tamaño: " + mochila.getTamaño());
        System.out.println("Numero de bolsillos: " + mochila.getNumeroBolsillos());
        System.out.println("Deportivo: ");
        System.out.println("Color: " + deportivo.getColor());
        System.out.println("Talla: " + deportivo.getTalla());
        System.out.println("Numero de prendas: " + deportivo.getNumeroDePrendas());
        System.out.println("Cuaderno: ");
        System.out.println("Tipo: " + cuaderno.getTipo());
        System.out.println("Numero de hojas: " + cuaderno.getNumeroDeHojas());
        System.out.println();
    }
}