package ej4AbstractFactory;

public class Ingles implements IMateria{
    private Estudiante estudiante;

    public Ingles(){
    }

    @Override
    public void inscribirse() {
        System.out.println("Se inscribió a " + estudiante.getNombre() + " a la materia de Ingles");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
