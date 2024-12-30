import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.print("Enter your choice: \n0 for ROCK\n1 for PAPER\n2 for SCISSORS: ");
        Scanner sc= new Scanner(System.in);
        int humanChoice= sc.nextInt();
        switch(humanChoice){
            case 0:
                System.out.println("Your choice: ROCK");
                break;
            case 1:
                System.out.println("Your choice: PAPER");
                break;
            case 2:
                System.out.println("Your choice: Scissors");
        }
        Random ra= new Random();
        int comp=ra.nextInt(3);
        switch(comp){
            case 0:
                System.out.println("Your choice: ROCK");
                break;
            case 1:
                System.out.println("Your choice: PAPER");
                break;
            case 2:
                System.out.println("Your choice: Scissors");
                break;
            default:
                System.out.println("Wrong input!");
        }
        if(humanChoice<0 || humanChoice>2){
            System.out.println("Invalid choice!!");
            return;
        }
        if(comp==humanChoice){
            System.out.println("Draw!");
        }
        else if(humanChoice==0 && comp==2 || humanChoice==1 && comp==0 || humanChoice==2 && comp==1){
            System.out.println("You win!!!");
        }
        else{
            System.out.println("You lost!!!");
        }
    }
}
