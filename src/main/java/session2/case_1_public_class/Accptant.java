package session2.case_1_public_class;

public class Accptant {
    private  String name;
    private String emailAdress;
    private  int phonenumber;

    public Accptant(String name, String emailAdress, int phonenumber) {
        this.name = name;
        this.emailAdress = emailAdress;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
