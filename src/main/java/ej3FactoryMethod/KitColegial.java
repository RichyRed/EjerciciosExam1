package ej3FactoryMethod;

public class KitColegial implements IProducto {
    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;

    public KitColegial(Mochila mochila, Libro libro, Computadora computadora) {
        this.mochila = mochila;
        this.libro = libro;
        this.computadora = computadora;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void showInfo() {
        System.out.println("Kit colegial");
        System.out.println("Mochila: ");
        System.out.println("Tamaño: " + mochila.getTamaño());
        System.out.println("Numero de bolsillos: " + mochila.getNumeroBolsillos());
        System.out.println("Libro: ");
        System.out.println("Género: " + libro.getGenero());
        System.out.println("Auto: " + libro.getAutor());
        System.out.println("Compu: ");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("OS: " + computadora.getOs());
        System.out.println();
    }
}
