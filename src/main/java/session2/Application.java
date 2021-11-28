package session2;

import session2.case_1_public_class.Profesor;
import session2.case_1_public_class.Student;
import session2.case_2_abstract_class.Cat;
import session2.case_2_abstract_class.Dog;

public class Application {

    public static void main(String args[]) {
        Student student = new Student("Ion", "email@gmail.com", 072052, 22);
//    student.getAbsences();
//    student.readNote("math")

        Cat cat = new Cat();
        cat.miau();
        Dog dog= new Dog();
        dog.ham();

    }
}