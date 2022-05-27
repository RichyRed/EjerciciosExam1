package ej4AbstractFactory;

public class FactoryMateria {
    public static IMateria make(String typeProduct){
        IMateria materia;
        switch (typeProduct.toLowerCase()){
            case "matematicas":
                materia = new Mate();
                break;
            case "lenguaje":
                materia = new Lenguaje();
                break;
            case "historia":
                materia = new Historia();
                break;
            default:
                materia = new Ingles();
                break;
        }
        return materia;
    }
}
