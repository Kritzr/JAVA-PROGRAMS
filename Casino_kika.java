import java.util.Random;
import java.util.Scanner;

public class Casino_kika {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();
        int credit = 1000;
        int target = 2000;
        int amt = 100;
        System.out.println("Krithika_2022503035");
        System.out.println("Start credits: "+ credit);
        System.out.println("End goal: "+ target);
        while(credit > 0 && credit < target){
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6)+ 1;
            int sum = d1+ d2;
            System.out.println("The rolled values are : " + d1 + " and " + d2);
            if(sum == 7 || sum ==11){
                credit += amt;
                System.out.println("You win! Current credits: " +credit);
            }
            else if(sum ==2 || sum ==3 || sum ==12){
                credit -= amt;
                System.out.println("You lose! Current credits: " +credit);
            }
            else{
                System.out.println("No change in credits. Current credits: " + credit);
            }
            if(credit <=0){
                System.out.println("Yo are bankrupt! Game over!");
                break;
            }
            else if(credit >=target){
                System.out.println("Congratulations! You've reached " +credit+ " and won the gaame!");
            }
            System.out.println("continue or quit?");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("quit")){
                System.out.println("Thanks for playing! You have ended with "+credit + "credits!");
                break;

            }
        }


    }
}
