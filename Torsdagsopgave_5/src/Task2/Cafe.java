package Task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        File coffeeList = new File("coffee.txt");
        try {
            Scanner scan = new Scanner(coffeeList);
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");

        }

    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
