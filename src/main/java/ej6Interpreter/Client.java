package ej6Interpreter;

public class Client {
    public static void main(String[] args) {
        String e= "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Interpreter parser=new Interpreter(e);
        System.out.println("Mensaje de entrada:");
        System.out.println(e);
        System.out.println("Mensaje de salida: "+parser.evaluateMsg());
    }
}