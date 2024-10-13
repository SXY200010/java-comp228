import javax.swing.*;
import java.util.Random;

public class Lotto
{
    private int []lottoNumbers;
    public Lotto()
    {
        lottoNumbers=new int[3];
        Random rand=new Random();
        for (int i=0;i<lottoNumbers.length;i++)
        {
            lottoNumbers[i]=rand.nextInt(9)+1;
        }
    }

    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    public int getSum()
    {
        int sum=0;
        for (int i=0;i<lottoNumbers.length;i++)
        {
            sum+=lottoNumbers[i];
        }
        return sum;
    }

    public static int getInput()
    {
        int userNumbers = 0;
        boolean validInput = false;

        while (!validInput)
        {
            String input = JOptionPane.showInputDialog(null, "Choose a number between 3 and 27:");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "You cancelled the game.", "Cancelled", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            if (input.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Input cannot be empty. Please enter a number between 3 and 27.", "Empty Input", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                userNumbers = Integer.parseInt(input);
                if (userNumbers < 3 || userNumbers > 27)
                {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 3 and 27.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                }
                else
                    validInput = true;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            }
        }
        return userNumbers;
    }

   public static void main(String[] args)
   {
        boolean userWins=false;
        int maxTries=5;

        for (int i=0;i<maxTries;i++)
        {
            int userNumber = getInput();
            Lotto lotto=new Lotto();
            int [] lottoNumbers=lotto.getLottoNumbers();
            int sum=lotto.getSum();

            JOptionPane.showMessageDialog(null, "Lotto numbers: " + lottoNumbers[0] + ", " + lottoNumbers[1] + ", " + lottoNumbers[2] + "\nSum: " + sum);

            if (sum==userNumber)
            {
                JOptionPane.showMessageDialog(null,"Congratulations!You win!");
                userWins=true;
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Try again!");
            }
        }
       if (userWins==false)
       {
           JOptionPane.showMessageDialog(null,"Sorry, the computer wins.");
       }
    }
}
