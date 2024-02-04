import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rangeMin = 1;
        int rangeMax = 100;
        int maxAttempts = 5;
        int totalRounds = 1;
        int totalWins = 0;
		String answer;

        do {
            int targetNumber = random.nextInt(rangeMax - rangeMin + 1) + rangeMin; 
            int attempts = 0;

            System.out.println("Guess a number between " + rangeMin + " and " + rangeMax + ".");

            while (attempts < maxAttempts) {
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guess is right " + attempts + " attempts.");
                    totalWins++;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you ran out of attempts. The number was " + targetNumber + ".");
            }

            System.out.println("Do you want to play again? (y/n)");
            answer = scanner.next();
			
			if(answer.equalsIgnoreCase("y")){
				totalRounds++;
			}
			else if(answer.equalsIgnoreCase("n")){
				totalRounds = totalRounds ;
			}
			else{
				System.out.println("Invalid choice, Please choose correct option");
			}
			
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("You played " + totalRounds + " rounds and won " + totalWins + " times.");

        scanner.close();
    }
}