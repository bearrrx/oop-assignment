package swing;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random Dancan = new Random();
        Scanner Oiseni = new Scanner(System.in);
        int guess;
        boolean continueGame = true; // the flag (boolean) that allows us to check if the user wants to continue the game or not

        while(continueGame) {
            boolean win = false;
            int NumToGuess = Dancan.nextInt(100); // moved into the while loop because they need to be initialized every time you start the game
            int NumOfTries = 0;

            while (win == false) {

                System.out.println("I'm thinking of a number between 0 and 100, can you guess it?");
                guess = Oiseni.nextInt();
                NumOfTries++;

                if (guess == NumToGuess) {
                    win = true;
                }
                else if (guess < NumToGuess) {
                    System.out.println("Your guess is too low");
                }
                else if (guess > NumToGuess) {
                    System.out.println("Your guess is too high");
                }
            }

            System.out.println("Congratulations!");
            System.out.println("The number was " + NumToGuess);
            System.out.println("It took you " + NumOfTries + " tries"); 

            // As CandiedOrange already noted, you need to remove the while loop which was here.
            String YesOrNo;
            YesOrNo = Oiseni.nextLine();
            System.out.println("Would you like to play again? " + YesOrNo);
            YesOrNo = Oiseni.nextLine();

            if (YesOrNo.equalsIgnoreCase("yes"))
            {
                System.out.println("Ok, let's play again.");
                continueGame = true;
            }
            else
            {
                System.out.println("Ok, maybe next time.");
                continueGame = false;
            }
        }
    }
}
