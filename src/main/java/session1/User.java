package session1;

public class User {

    public String username;
    public String password;

    public User() {
        this("test", "password");
        username="John";
        password="test";
    }


    public User(String username1, String password1){
        username=username1;
        password=password1;
    }

    public String getUsername() {
        return username;
    }

    public  String getPassword(){
        return password;
    }


    public void setPassword(String password){

        this.password= password;

    }

}
