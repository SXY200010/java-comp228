import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Insurance[] insurances = new Insurance[2];
        for (int i = 0; i < insurances.length; i++)
        {
            Insurance insurance = null;
            while (true)
            {
                System.out.println("Please enter the insurance type");
                String insuranceType = input.nextLine();
                if (insuranceType.toLowerCase().equalsIgnoreCase("health"))
                {
                    insurance =new Health();
                    break;
                }
                else if (insuranceType.toLowerCase().equalsIgnoreCase("life"))
                {
                    insurance =new Life();
                    break;
                }
                else
                {
                    System.out.println("Invalid type.");
                }
            }
            System.out.println("Enter the monthly cost of the insurance:");
            double cost = 0;
            while (true)
            {
                System.out.println("Enter the monthly cost of the insurance:");
                if (input.hasNextDouble())
                {
                    cost = input.nextDouble();
                    input.nextLine();
                    if (cost > 0)
                    {
                        break;
                    } else
                    {
                        System.out.println("Cost must be positive. Please enter a valid amount.");
                    }
                } else
                {
                    System.out.println("Invalid input. Please enter a numeric value for the cost.");
                    input.nextLine(); 
                }
            }
            insurance.setInsuranceCost(cost);
            insurances[i] = insurance;
        }
        for (Insurance insurance : insurances)
        {
            insurance.displayInfo();
        }
    }
}

