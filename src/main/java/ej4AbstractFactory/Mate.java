package ej4AbstractFactory;

public class Mate implements IMateria{
    private Estudiante estudiante;

    public Mate(){}

    @Override
    public void inscribirse() {
        System.out.println("Se inscribió a " + estudiante.getNombre() + " a la materia de Matematicas");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}