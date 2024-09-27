import javax.swing.*;
import java.util.Random;

public class Test
{
    public static String simulateQuestion(int questionNumber)
    {
        String question = "";
        switch(questionNumber)
        {
            case 1: question = "What is Java?\n1. Programming Language\n2. Coffee\n3. Movie\n4. An island in Indonesia";
            break;
            case 2: question = "Which one of the following symbols indicates a single line comment in Java application source code?\n1. //\n2. **\n3. */\n4. /*";
            break;
            case 3: question = "Which of the following Java program units defines a group of related objects?\n1. Java default constructor\n2. Java Class\n3. Java\n4. Java method";
            break;
            case 4: question = "Which of the following typically groups related classes so that they could be imported into programs and reused?\n1. IDE\n2. Function\n3. Method\n4. Package";
            break;
            case 5: question = "To make efficient use of Exception Handling in Java, you must do the one of the following:\n1. Only use one try block\n2. Only use one catch block\n3. use at least try and one catch block\n4. use finally block";
            break;
        }
        return question;
    }

    public static boolean checkAnswer(int questionNumber, int answer)
    {
        int correctAnswer = 0;
        switch(questionNumber)
        {
            case 1: correctAnswer = 1;
            break;
            case 2: correctAnswer = 1;
            break;
            case 3: correctAnswer = 2;
            break;
            case 4: correctAnswer = 4;
            break;
            case 5: correctAnswer = 3;
            break;
        }
        return correctAnswer == answer;
    }

    public static String generateMessage(boolean isCorrect)
    {
        Random rand = new Random();
        int messageNumber = rand.nextInt(4) ;
        String message = "";
        if(isCorrect)
        {
            switch(messageNumber)
            {
                case 1: message="Excellent!";
                break;
                case 2: message="Good!";
                break;
                case 3: message="Keep up the good work!";
                break;
                case 4: message="Nice work!";
                break;
            }
        }
        else
        {
            switch(messageNumber)
            {
                case 1: message="No. Please try again.";
                break;
                case 2: message="Wrong. Try once more.";
                break;
                case 3: message="Don't give up!";
                break;
                case 4: message="No. Keep trying.";
                break;
            }
        }
        return message;
    }

    public void inputAnswer()
    {
        int correctCount = 0;
        int incorrectCount = 0;

        for (int i = 1; i <= 5; i++)
        {
            boolean validInput = false;
            int userAnswer=0;
            while (!validInput)
            {
                String question = simulateQuestion(i);
                String answer = JOptionPane.showInputDialog(null, question, "Test", JOptionPane.QUESTION_MESSAGE);
                if (answer==null)
                {
                    JOptionPane.showMessageDialog(null, "You cancelled the test.", "Cancelled", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                if (answer.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Input cannot be empty. Please enter a number between 1 and 4.", "Empty Input", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                try
                {
                   userAnswer = Integer.parseInt(answer);
                    if (userAnswer<1||userAnswer>4)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 4.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    }
                    else
                        validInput = true;
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                }
            }

            if (checkAnswer(i, userAnswer)) {
                correctCount++;
                JOptionPane.showMessageDialog(null, generateMessage(true), "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                incorrectCount++;
                JOptionPane.showMessageDialog(null, generateMessage(false), "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        int totalQuestions = correctCount + incorrectCount;
        int percentage = (correctCount * 100) / totalQuestions;

        JOptionPane.showMessageDialog(null, "Test Complete!\nCorrect answers: " + correctCount +
                "\nIncorrect answers: " + incorrectCount +
                "\nPercentage: " + percentage + "%", "Test Results", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args)
    {
        Test test = new Test();
        test.inputAnswer();
    }
}
