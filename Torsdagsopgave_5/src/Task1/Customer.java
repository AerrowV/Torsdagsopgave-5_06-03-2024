package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;


    Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.username = username;
        this.lastName = lastName;

        this.id = counter++;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    @Override

    public String toString(){
        String userinfo= this.firstName + " " + this.lastName +"\n"+this.username+"\n"+this.id+ "\n";

        return userinfo;



    }

}