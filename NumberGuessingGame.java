import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess = 0;
        int numOfGuesses = 0;
        boolean hasWon = false;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("I am thinking of a number between 1 and 100. Can you guess what it is?");
        
        while (numOfGuesses < 10) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numOfGuesses++;
            
            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low!");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high!");
            } else {
                hasWon = true;
                break;
            }
        }
        
        if (hasWon) {
            System.out.println("Congratulations! You guessed the number in " + numOfGuesses + " tries!");
        } else {
            System.out.println("Sorry, you have run out of guesses. The number was " + randomNumber + ".");
        }
        
        scanner.close();
    }
}
