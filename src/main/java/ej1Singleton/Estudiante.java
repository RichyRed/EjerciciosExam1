package ej1Singleton;

public class Estudiante {
    private String nombre;
    public Estudiante(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void pagoMatricula(int monto){
        System.out.println("Actualiza tu pago: " +nombre);
        Ventanilla.getInstance().pagar(monto);
    }
}
