package ej3FactoryMethod;

public class CreatorKitEscolar extends Creator {
    @Override
    public KitEscolar createKit() {
        Mochila mochila = new Mochila();
        mochila.setTamaño("Grande");
        mochila.setNumeroBolsillos(5);

        Deportivo deportivo = new Deportivo();
        deportivo.setColor("Negro");
        deportivo.setTalla("L");
        deportivo.setNumeroDePrendas(10);

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("Carta");
        cuaderno.setNumeroDeHojas(150);

        KitEscolar kit1 = new KitEscolar(mochila, deportivo, cuaderno);

        return kit1;
    }
}
