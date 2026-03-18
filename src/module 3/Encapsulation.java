package assignment1.partThree;

public class Encapsulation {
    private int id;
    private String email;
    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    // getters
    public int getId(){
        return this.id;
    }
    public String getEmail(){
        return this.email;
    }
}