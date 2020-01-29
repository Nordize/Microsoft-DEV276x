import java.util.*;

public class odds_or_evens {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //intro
        System.out.println("Let's play a game called \"Odds and Evens\" ");
        //take in the users name, odds or evens
        System.out.print("What is your name? ");
        String user_name = input.next();

        System.out.print("Hi " + user_name+ ", which do you choose? (O)dds or (E)vens: ");
        String choose_side = input.next().toUpperCase();

        if (choose_side.equals("O")){
            System.out.println(user_name + " has picked odds! The computer will be evens.");
        }else if(choose_side.equals("E")){
            System.out.println(user_name + " has picked evens! The computer will be odds.");
        }

        System.out.println("---------------------------------------------------------------");

        //randomizer
        //takes in the number of "fingers" the user would like to play, and uses
        System.out.print("How many \"fingers\" do you put out? ");
        int user_finger_num = input.nextInt();

        //the random generator to decide what the computer will play
        Random random= new Random();
        int computer = random.nextInt(6);

        System.out.println("the computer plays "+ computer+" \"fingers\".");
        System.out.println("---------------------------------------------------------------");
        //sum
        int sum = user_finger_num+computer;
        //adds the 2 intergers together and products the sum
        System.out.println(user_finger_num +" + "+ computer + " = " + sum);
        boolean oddOrEven = sum % 2 ==0;

        if (oddOrEven){
            System.out.println(sum + " is ...Evens number");
        }else {
            System.out.println(sum + " is ...Odds number");
        }


        //who wins
        //decided whether the final answer is even or odd, and declares a winner
        if((choose_side.equals("O")) && (!oddOrEven)){
            System.out.println("That means " + user_name + " wins! :)");
        }else if((choose_side.equals("O")) &&  (oddOrEven)){
            System.out.println("That means " + user_name + " loses! :)");
        }else if ((choose_side.equals("E")) &&  (oddOrEven)){
            System.out.println("That means " + user_name + " wins! :)");
        }else if ((choose_side.equals("E")) &&  (!oddOrEven)){
            System.out.println("That means " + user_name + " loses! :)");
        }
        System.out.println("---------------------------------------------------------------");
    }
}
