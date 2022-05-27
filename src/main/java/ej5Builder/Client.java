package ej5Builder;

public class Client {
    public static void main(String[] args){
        Restaurante cocinero = new Restaurante();
        Tira tira = new Tira();
        Bife bife = new Bife();
        Lomito lomito = new Lomito();

        cocinero.setBuilder(tira);
        cocinero.buildProduct();
        Carne pedido1 = cocinero.getProductBuilder();
        pedido1.showInfo();

        cocinero.setBuilder(bife);
        cocinero.buildProduct();
        Carne pedido2 = cocinero.getProductBuilder();
        pedido2.showInfo();

        cocinero.setBuilder(lomito);
        cocinero.buildProduct();
        Carne pedido3 = cocinero.getProductBuilder();
        pedido3.showInfo();
    }
}
