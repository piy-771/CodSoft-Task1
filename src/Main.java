import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random num = new Random();


        Scanner sc = new Scanner(System.in);
        int score = 0;
        int round = 0;
        String ans;
        System.out.println("Number game");
        System.out.println("In this game you have guess any number between 1 to 100(inclusively) ");
        System.out.println("If u guessed it right you will get a point and you have 5 attempts to guess it in each round");
        do {

            for(int i =0;i<=4;i++){
                int randomNumber = num.nextInt(100);

                System.out.println("Guess a number : ");  //you can only guess ten number
                int guessNumber = sc.nextInt();
                if(randomNumber>guessNumber){
                    System.out.println("too low");
                } else if (randomNumber<guessNumber) {
                    System.out.println("too high" );
                }else {
                    System.out.println("You guessed correct number");
                    score++;
                }

            }
            System.out.println("Your Score = "+ score);
            round++;
            System.out.println("Round played = "+round);
            System.out.println("do you want to play again,yes or no");
            sc.nextLine();
            ans = sc.nextLine();


        }while (ans.equalsIgnoreCase("yes"));
        sc.close();

    }
}