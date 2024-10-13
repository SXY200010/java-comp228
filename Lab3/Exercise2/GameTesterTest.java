import java.util.Scanner;

public class GameTesterTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the game tester:");
        String name = input.nextLine();
        GameTester gameTester;

        while (true)
        {
            System.out.println("Enter the type of game tester (Full-time or Part-time):");
            String type = input.nextLine();
            if (type.toLowerCase().equalsIgnoreCase("Full-time")) {
                gameTester = new FullTimeGameTester(name);
                break;
            } else if (type.equalsIgnoreCase("Part-time")) {
                gameTester = new PartTimeGameTester(name);
                int hours;
                while (true) {
                    System.out.println("Enter the number of hours worked:");
                    if (input.hasNextInt()) {
                        hours = input.nextInt();
                        input.nextLine();
                        if (hours >= 0) {
                            break;
                        } else {
                            System.out.println("Hours worked must be non-negative. Please enter a valid number of hours.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numeric value for hours.");
                        input.nextLine();
                    }
                }
                System.out.println("Part-time Tester Salary: " + gameTester.determineSalary(hours));
                return;
            } else {
                System.out.println("Invalid type. Please enter either 'Full-time' or 'Part-time'.");
            }
        }
    }
}
