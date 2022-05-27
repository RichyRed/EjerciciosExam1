package ej4AbstractFactory;

public class Lenguaje implements IMateria{
    private Estudiante estudiante = new Estudiante();

    public Lenguaje() {
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    @Override
    public void inscribirse() {
        System.out.println("Se inscribió a " + estudiante.getNombre() + " a la materia de Lenguaje");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}