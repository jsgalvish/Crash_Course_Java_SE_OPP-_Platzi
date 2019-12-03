package model;

public class Nurse extends User {

    private String speciality;

    public Nurse( String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Cruz Verde");
        System.out.println("Departamento: Pediatria");
    }
}
