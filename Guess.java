//Guess.java
//Ruchi Sheth
//rjsheth
//pa2
//Guess game where user gets three tries to guess a number.

import java.util.Scanner;
import java.lang.Math;

class Guess {
    public static void main (String[] args) {

        int ori, first,second,third;
        int try_number = 0;
        Scanner sc = new Scanner(System.in);
        ori  = (int) ((Math.random()*10) + 1);

        while ( try_number < 3){
            System.out.println();
            System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.\n");
            System.out.print("Enter your first guess: ");
            try_number++;
            first = sc.nextInt();
            if (ori<first) {
                System.out.println("Your guess is too high.\n");
            } else if(ori>first) {
                System.out.println("Your guess is too low.\n");
            } else if (ori == first) {
                System.out.println("You win!\n");
                break;
            }
            System.out.print("Enter your second guess: ");
            second = sc.nextInt();
            try_number++;
            if (ori<second) {
                System.out.println("Your guess is too high.\n");
            } else if(ori>second) {
                System.out.println("Your guess is too low.\n");
            } else if (ori == second) {
                System.out.println("You win!\n");
                break;
            }
            System.out.print("Enter your third guess: ");
            third = sc.nextInt();
            try_number++;
            if (ori<third){
                System.out.println("Your guess is too high.\n");
                System.out.println("You lose. The number was " + ori +".\n");
            } else if (ori>third) {
                System.out.println("Your guess is too low.\n");    
                System.out.println("You lose. The number was " + ori +".\n");
            } else if (ori == third) {
                System.out.println("You win!\n");
                break;
            }
        }
    }
}                      
