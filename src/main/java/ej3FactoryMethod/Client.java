package ej3FactoryMethod;

public class Client {
    public static void main(String[] args){
        KitEscolar kitE = new CreatorKitEscolar().createKit();
        kitE.showInfo();

        KitColegial kitC = new CreatorKitColegial().createKit();
        kitC.showInfo();
    }
}
