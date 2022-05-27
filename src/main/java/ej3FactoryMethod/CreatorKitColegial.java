package ej3FactoryMethod;

public class CreatorKitColegial extends Creator {
    @Override
    public KitColegial createKit() {
        Mochila mochila = new Mochila();
        mochila.setTamaño("Pequeño");
        mochila.setNumeroBolsillos(5);

        Libro libro = new Libro();
        libro.setGenero("Historia");
        libro.setAutor("Simon Bolivar");

        Computadora computadora = new Computadora();
        computadora.setMarca("Lenovo");
        computadora.setOs("Windows 10");

        KitColegial kit2 = new KitColegial(mochila, libro, computadora);

        return kit2;
    }
}
