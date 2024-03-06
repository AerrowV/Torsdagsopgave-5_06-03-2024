package Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Asim", "Kilic", "Aerrow"));
        customers.add(new Customer("Johan", "Poulsen", "Ash"));
        customers.add(new Customer("Lasse", "Hansen", "Maximitas"));

        printCustomers(customers);

    }
    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }


    }
}