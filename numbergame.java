import java.util.*;

public class numbergame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        int winScore = 0;
        int chances = 5;
        int randNum = rand.nextInt(101);
        int flag = 0;
        while(true){
            System.out.println("Enter the Number: ");
            int guessedNum = s.nextInt();

            int closeDistance = Math.abs(guessedNum - randNum);

            if (closeDistance == 0) {
                System.out.println("Congratulations! You've guessed the correct number: " + randNum);
                System.err.println("You get +1 chances.");
                winScore++;
                chances++;
                flag = 1;

            } 
            else if (closeDistance <= 10) {
                System.out.println("Just miss, You are too close!");
                chances--;
            } 
            else {
                System.out.println("You're far away. Try again!");
                chances--;
            }

            System.out.println("Chances you have left with: " + chances);
            System.out.println("Your Score is: " + winScore);

            if(chances == 0){
                System.out.println("Your Chances are Over.");
                System.out.println("The Number PC guessed is: " + randNum);
            }

            System.out.println("Do you want to play again..>>?? [y/n]");
            char c = s.next().charAt(0);

            if(c == 'n' || chances == 0){
                break;
            }

            if(flag == 1){
                randNum = rand.nextInt(101);
            }
            
        }

        System.out.println("Thanks For Playing my game");
        
        s.close();
        
    }
    
}
