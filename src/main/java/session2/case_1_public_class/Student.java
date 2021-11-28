package session2.case_1_public_class;

import java.util.Random;

public class Student extends Accptant {

    private  int studentNumber;

    public Student(String name, String emailAdress, int phonenumber,int studentNumber) {
        super(name, emailAdress, phonenumber);
    }
    public  void readNote(String domain){
        System.out.println(new Random().nextInt(10));
    }

    public  void getAbsences(){
        System.out.println(new Random().nextInt(100));
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
}
