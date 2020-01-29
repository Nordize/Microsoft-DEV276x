import java.util.Scanner;

public class longest_name {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        longest_name(console,5);

    }

    public static void longest_name(Scanner console,int names) {

        String longest = "";
        boolean tie = false;
        for (int i = 1; i <= names; i++) {
            System.out.print("name #" + i + "? ");
            String name = console.next();
            if (name.length() == longest.length()) {
                tie = true;
            } else if (name.length() > longest.length()) {
                tie = false;
                longest = name;
            }
        }
        String capitalized = longest.substring(0, 1).toUpperCase() +
                longest.substring(1).toLowerCase();
        System.out.println(capitalized + "'s name is longest");
        if (tie)
            System.out.println("(There was a tie!)");

    }


}
