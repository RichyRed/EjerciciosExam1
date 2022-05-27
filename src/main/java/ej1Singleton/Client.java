package ej1Singleton;

public class Client {
    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        cajero.setCodigoCajero(66666);
        cajero.registrarseVentanilla();

        Estudiante e1 = new Estudiante();
        e1.setNombre("Superman");
        e1.pagoMatricula(111);
        cajero.saldoCajer();

        Estudiante e2 = new Estudiante();
        e2.setNombre("Batman");
        e2.pagoMatricula(222);
        cajero.saldoCajer();

        Estudiante e3 = new Estudiante();
        e3.setNombre("Flash");
        e3.pagoMatricula(333);
        cajero.saldoCajer();

        Estudiante e4 = new Estudiante();
        e4.setNombre("Aquaman");
        e4.pagoMatricula(444);
        cajero.saldoCajer();

        Estudiante e5 = new Estudiante();
        e5.setNombre("Wonder Woman");
        e5.pagoMatricula(555);
        cajero.saldoCajer();
    }
}
