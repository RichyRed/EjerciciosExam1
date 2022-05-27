package ej3FactoryMethod;

public class Cuaderno {
    private String tipo;
    private int numeroDeHojas;

    public Cuaderno(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDeHojas() {
        return numeroDeHojas;
    }

    public void setNumeroDeHojas(int numeroDeHojas) {
        this.numeroDeHojas = numeroDeHojas;
    }
}