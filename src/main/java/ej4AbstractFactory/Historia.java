package ej4AbstractFactory;

public class Historia implements IMateria{
    private Estudiante estudiante;

    public Historia(){
    }

    @Override
    public void inscribirse() {
        System.out.println("Se inscribió a " + estudiante.getNombre() + " a la materia de Historia");
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
