package ej2Prototype;

public class Client {
    public static void main(String[] args){
        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCargaHoraria(80);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setHoraDeEntrada("08:00");
        contrato.setHoraDeSalida("18:00");

        Contrato c1 = (Contrato) contrato.clone();
        c1.setNombre("Tony");
        c1.setApellido("Stark");
        c1.showInfo();

        Contrato c2 = (Contrato) contrato.clone();
        c2.setNombre("Steven");
        c2.setApellido("Strange");
        c2.showInfo();

        Contrato c3 = (Contrato) contrato.clone();
        c3.setNombre("Steve");
        c3.setApellido("Rogers");
        c3.showInfo();

        Contrato c4 = (Contrato) contrato.clone();
        c4.setNombre("Clint");
        c4.setApellido("Barton");
        c4.showInfo();

        Contrato c5 = (Contrato) contrato.clone();
        c5.setNombre("Natasha");
        c5.setApellido("Romanoff");
        c5.showInfo();

        Contrato c6 = (Contrato) contrato.clone();
        c6.setNombre("Bruce");
        c6.setApellido("Banner");
        c6.showInfo();

        Contrato c7 = (Contrato) contrato.clone();
        c7.setNombre("Thor");
        c7.setApellido("Odinson");
        c7.showInfo();

        Contrato c8 = (Contrato) contrato.clone();
        c8.setNombre("Peter");
        c8.setApellido("Parker");
        c8.showInfo();

        Contrato c9 = (Contrato) contrato.clone();
        c9.setNombre("Wanda");
        c9.setApellido("Maximoff");
        c9.showInfo();

        Contrato c10 = (Contrato) contrato.clone();
        c10.setNombre("Prieto");
        c10.setApellido("Maximoff");
        c10.showInfo();

        Contrato c11 = (Contrato) contrato.clone();
        c11.setNombre("Bucky");
        c11.setApellido("Barnes");
        c11.showInfo();

        Contrato c12 = (Contrato) contrato.clone();
        c12.setNombre("Nick");
        c12.setApellido("Fury");
        c12.showInfo();

        Contrato c13 = (Contrato) contrato.clone();
        c13.setNombre("America");
        c13.setApellido("Chavez");
        c13.showInfo();

        Contrato c14 = (Contrato) contrato.clone();
        c14.setNombre("Peter");
        c14.setApellido("Quill");
        c14.showInfo();

        Contrato c15 = (Contrato) contrato.clone();
        c15.setNombre("Matt");
        c15.setApellido("Murdock");
        c15.showInfo();
    }
}