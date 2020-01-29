import java.util.*;

public class MazeRunner_final_project {
    static Maze myMap = new Maze();
    static int moves = 1;

    public static void main(String[] asgs){
        intro();

    }

    public static void intro(){
        //welcome the user into the program and print the new map
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
        System.out.println("--------------------------------------------------");
        userMove();

    }

    public static void userMove(){
        Scanner input = new Scanner(System.in);



        System.out.print("Where would you like to move? (R, L, U, D)");
        String direction = input.next().toUpperCase();

        while(moves <= 100){

            System.out.println("Your moves: "+moves);

            if (direction.equals("R") ) {
                if(!myMap.didIWin()){
                    System.out.println("Keep Going!");

                    if(myMap.canIMoveRight()){
                        myMap.moveRight();
                        myMap.printMap();
                        System.out.println("--------------------------------------------------");


                    }else if(myMap.isThereAPit(direction)){
                        navigatePit(direction);
                    }

                    else {
                        System.out.println("Sorry you've hit the a wall on the Down.");
                        myMap.printMap();
                        System.out.println("--------------------------------------------------");

                    }
                }
            }
            else if(direction.equals("L")){
                if(!myMap.didIWin()){
                    System.out.println("Keep Going!");
                    if(myMap.canIMoveLeft()){
                        myMap.moveLeft();
                        myMap.printMap();
                        System.out.println("--------------------------------------------------");


                    }else if(myMap.isThereAPit(direction)){
                        navigatePit(direction);
                    }

                    else {
                        System.out.println("Sorry you've hit the a wall on the Down.");
                        myMap.printMap();
                        System.out.println("--------------------------------------------------");

                    }
                }
            }else if(direction.equals("U")){
                if(!myMap.didIWin()){
                    System.out.println("Keep Going!");

                    if(myMap.canIMoveUp()){
                        myMap.moveUp();
                        myMap.printMap();
                        System.out.println("--------------------------------------------------");


                    }else if(myMap.isThereAPit(direction)){
                        navigatePit(direction);
                    }

                    else {
                        System.out.println("Sorry you've hit the a wall on the Down.");
                        myMap.printMap();
                        System.out.println("--------------------------------------------------");

                    }
                }
            }else if(direction.equals("D")){
                if(!myMap.didIWin()){
                    System.out.println("Keep Going!");
                    if(myMap.canIMoveDown()){
                        myMap.moveDown();
                        myMap.printMap();
                        System.out.println("--------------------------------------------------");


                    }else if(myMap.isThereAPit(direction)){
                        navigatePit(direction);
                    }

                    else {
                        System.out.println("Sorry you've hit the a wall on the Down.");
                        myMap.printMap();
                        System.out.println("--------------------------------------------------");

                    }
                }

            }
            else {
                System.out.println("Please try again.");
                userMove();


            }
            movesMessage(moves);
            moves++;

            userMove();

        }

    }


    public static void movesMessage(int moves){
        //print message after certain number of moves
        //count moves

        if(moves == 50 && !myMap.didIWin()){
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        }else if(moves == 75 && !myMap.didIWin()){
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        }else if(moves == 90 && !myMap.didIWin()){
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        }else if(moves == 100 && !myMap.didIWin()){
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
            System.out.println("Sorry, but you didn't escape in time, you lose!");
            System.exit(1);
        }else if(moves <= 100 && myMap.didIWin()){
            System.out.println("Congratulations, you made it out alive!");
            System.out.println("and you did it in "+moves+" moves");
            System.exit(0);
        }

    }

    public static void navigatePit(String direction){

        Scanner input = new Scanner(System.in);

        //myMap.isThereAPit(direction); // Takes in the direction String the user entered in and returns if there is a pit ahead
        //myMap.jumpOverPit(direction); // Will jump over a pit in the direction given, skipping that space and landing 2 spaces over in the direction specified.

        System.out.print("Watch out! There's a pit ahead, jump it?");
        String answer = input.next();

        if(answer.startsWith("y")){
            myMap.jumpOverPit(direction); // Will jump over a pit in the direction given, skipping that space and landing 2 spaces over in the direction specified.
            myMap.printMap();
            System.out.println("--------------------------------------------------");

            moves++;
            userMove();

        }else
        {
            myMap.printMap();
            System.out.println("--------------------------------------------------");

            moves++;
            userMove();
        }



    }

}
