import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Carpet> carpets = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        firstMenu();
    }

    public static void firstMenu() {
        System.out.println("**Carpet-pet-pet System**\n");
        System.out.println("Menu:");
        System.out.println("1. Design New Carpet");
        System.out.println("2. List of Carpets");
        System.out.println("3. Search Carpet (By Map Pattern)");
        System.out.println("4. Buy Carpet (Based on the Amount of Money)");
        System.out.println("5. Directions to the Nearest Factory Store");
        System.out.println("0. Exit");

        System.out.print("\nEnter Index=> ");
        int n = input.nextInt();
        input.nextLine();
        switch (n) {
            case 0 -> {
                System.exit(0);
            }
            case 1 -> {
                Panel.designPanel();
                firstMenu();
            }
            case 2 -> {
                Panel.listOfCarpets();
                firstMenu();
            }
            case 3 -> {

            }
            case 4 -> {
                Panel.buyCarpet();
                firstMenu();
            }
            case 5 -> {
                Panel.shortestPath();
                firstMenu();
            }
            default -> System.out.println("Wrong Index!");
        }
    }
}
