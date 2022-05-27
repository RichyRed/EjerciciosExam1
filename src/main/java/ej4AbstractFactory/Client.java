package ej4AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Estudiante luis = new Estudiante();
        luis.setNombre("Armando Casas");
        luis.setCi("6666");
        IMateria inscripcion1 = FactoryMateria.make("Matematicas");
        inscripcion1.registrarEstudiante(luis);
        inscripcion1.inscribirse();

        Estudiante armando = new Estudiante();
        armando.setNombre("Susana Horia");
        armando.setCi("11111");
        IMateria inscripcion2 = FactoryMateria.make("Ingles");
        inscripcion2.registrarEstudiante(armando);
        inscripcion2.inscribirse();

        Estudiante carla = new Estudiante();
        carla.setNombre("Aquiles Bailo");
        carla.setCi("33333");
        IMateria inscripcion3 = FactoryMateria.make("Historia");
        inscripcion3.registrarEstudiante(carla);
        inscripcion3.inscribirse();

        Estudiante camila = new Estudiante();
        camila.setNombre("Dolores De la Vega");
        camila.setCi("99999");
        IMateria inscripcion4 = FactoryMateria.make("Lenguaje");
        inscripcion4.registrarEstudiante(camila);
        inscripcion4.inscribirse();

        Estudiante andres = new Estudiante();
        andres.setNombre("Elton Tito");
        andres.setCi("88888");
        IMateria inscripcion5 = FactoryMateria.make("Ingles");
        inscripcion5.registrarEstudiante(andres);
        inscripcion5.inscribirse();
    }
}