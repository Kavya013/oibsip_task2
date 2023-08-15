package Two_Tasks;

import java.util.Random;
import javax.swing.JOptionPane;


public class GuessTheNumGame {

	public static void main(String[] args){
		
		        int totalRounds = 3; // You can change this to the desired number of rounds.
		        int attemptsLimit = 5; // You can change this to the desired number of attempts per round.
		        int score = 0;

		        for (int round = 1; round <= totalRounds; round++) {
		            System.out.println("Round " + round + " - Guess the Number!");

		            // Generate a random number between 1 and 100 (inclusive).
		            int randomNumber = new Random().nextInt(100) + 1;

		            int attempts = 0;
		            int userGuess;

		            while (attempts < attemptsLimit) {
		                String input = JOptionPane.showInputDialog(null, "Enter your guess (between 1 and 100):");
		                
		                // Validate user input (check if it is a valid number).
		                try {
		                    userGuess = Integer.parseInt(input);
		                } catch (NumberFormatException e) {
		                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.");
		                    continue;
		                }

		                // Check if the user's guess matches the generated number.
		                if (userGuess == randomNumber) {
		                    score += (attemptsLimit - attempts); // Award points based on the remaining attempts.
		                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number.\nYour score: " + score);
		                    break;
		                } else if (userGuess < randomNumber) {
		                    JOptionPane.showMessageDialog(null, "Try again! The number is higher.");
		                } else {
		                    JOptionPane.showMessageDialog(null, "Try again! The number is lower.");
		                }

		                attempts++;
		            }

		            if (attempts == attemptsLimit) {
		                JOptionPane.showMessageDialog(null, "Out of attempts! The number was " + randomNumber + ".");
		            }
		        }

		        JOptionPane.showMessageDialog(null, "Game Over!\nYour Final Score: " + score);
		    }
		


	}


