import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double primeRate;
        while (true)
        {
            System.out.println("Enter the current prime interest rate:");
            if (input.hasNextDouble())
            {
                primeRate = input.nextDouble();
                input.nextLine();
                if (primeRate > 0)
                {
                    break;
                }
                else
                {
                    System.out.println("Interest rate must be positive. Please enter a valid rate.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a numeric value for the interest rate.");
                input.nextLine(); // Consume invalid input
            }
        }

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < mortgages.length; i++)
        {
            String type;
            while (true)
            {
                System.out.println("Enter mortgage type (Business or Personal):");
                type = input.nextLine();
                if (type.equalsIgnoreCase("Business") || type.equalsIgnoreCase("Personal"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid type. Please enter either 'Business' or 'Personal'.");
                }
            }

            int mortgageNumber = i;

            System.out.println("Enter customer name:");
            String customerName = input.nextLine();

            double amount;
            while (true)
            {
                System.out.println("Enter mortgage amount:");
                if (input.hasNextDouble())
                {
                    amount = input.nextDouble();
                    input.nextLine();
                    if (amount > 0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Amount must be positive. Please enter a valid amount.");
                    }
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Please enter a numeric value for the amount.");
                    input.nextLine();
                }
            }

            int term;
            while (true)
            {
                System.out.println("Enter mortgage term (1, 3, or 5 years):");
                if (input.hasNextInt())
                {
                    term = input.nextInt();
                    input.nextLine();
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Please enter a numeric value for the term.");
                    input.nextLine();
                }
            }

            if (type.equalsIgnoreCase("Business"))
            {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, primeRate, term);
            }
            else
            {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
            }
        }

        for (Mortgage mortgage : mortgages)
        {
            mortgage.getMortgageInfo();
        }
    }
}

