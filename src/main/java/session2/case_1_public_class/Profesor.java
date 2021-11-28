package session2.case_1_public_class;

import java.util.Random;

public class Profesor extends Accptant {
    private  int profesorNumber;

    public void setStudentNumber(int studentNumber) {
        this.profesorNumber = studentNumber;
    }

    public int getStudentNumber() {
        return profesorNumber;
    }

    public Profesor(String name, String emailAdress, int phonenumber) {
        super(name, emailAdress, phonenumber);
        this.profesorNumber = profesorNumber;

    }

    public  void giveNote(String name){
        System.out.println("Note was set");
    }
    public void setAbscence(String domain){
        System.out.println("Abscence was set");
    }
}
