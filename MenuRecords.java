import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MenuRecords {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<MenuData> menuList = new ArrayList<MenuData>();
        MenuData menuData;
        String command;
        String foodName;
        String foodNationality;
        Integer foodPrice;
        Integer waitTime;

        do {
            System.out.println("a - add; p - print; q - quit;");
            command = scnr.next();

            if (command.equals("a")) {
                System.out.print("Enter a cuisine name: ");
                foodName = scnr.next();
                System.out.print("Enter a cuisine nationality: ");
                foodNationality = scnr.next();
                System.out.print("Enter a cuisine price: ");
                foodPrice = scnr.nextInt();
                System.out.print("Enter a cuisine wait-time: ");
                waitTime = scnr.nextInt();

                menuData = new MenuData(foodName, foodNationality, foodPrice, waitTime);
                menuList.add(menuData);
            }
            else if (command.equals("p")) {

                Collections.sort(menuList);
                System.out.println("");

                System.out.println("International Cuisine Menu: ");
                for (int i = 0; i < menuList.size(); ++i) {
                    System.out.println(menuList.get(i).toString());
                }
                System.out.println("");
            }

        } while (!command.equals("q"));
    }
}