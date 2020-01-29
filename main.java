import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main (String[] args){
        //intro();

        //budget();

        //time();

        //distance();

        cal_distance();
    }

    public static void intro(){  //Part1
        Scanner input = new Scanner(System.in);
        //takes in user name and destination

        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Nice to meet you " + name + ", Where are you travelling to?");
        String destination_name = input.nextLine();

        System.out.println("Great! " + destination_name + " sounds like a great trip");

        System.out.println("*************");
        System.out.println("\n");
    }

    public static void budget(){  //Part2
        Scanner input = new Scanner(System.in);
        //takes in days planned on trip, allowance, and converting info

        System.out.println("How many days are you going to spend traveling?");
        int num_day = input.nextInt();

        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        int pocket_money = input.nextInt();

        System.out.println("What is the three letter currency symbol for your travel destination?");
        String curr_name = input.next();

        System.out.println("How many "+curr_name+ " are there in 1 USD?");
        double curr_rate = input.nextDouble();

        int convert_to_hr = num_day*24;
        int convert_to_mins = convert_to_hr*60;
        double cal_pocket = (double)pocket_money/num_day;
        double cal_currency = pocket_money*curr_rate;

        System.out.println("SUMMARY");
        System.out.println("If you are travelling for "+num_day+ " days that is the same as "+convert_to_hr + " hours or " + convert_to_mins+ " minutes");
        System.out.printf("If you are going to spend $" +pocket_money+ " USD that means per day you can spend up to $%.2f USD %n",cal_pocket);
        System.out.printf("Your total budget in "+curr_name+ " is " + cal_currency + " "+curr_name+ ", which per day is %.2f " +curr_name + "%n", (double)cal_currency/num_day);


        System.out.println("*************");
        System.out.println("\n");
    }

    public static void time(){  //Part3
        Scanner input = new Scanner(System.in);
        //takes in time difference between home and destination

        String AM_PM = null;

        System.out.println("What is the time difference, in hours, between our home and your destination?");
        int time_diff_num = input.nextInt();

        //US time zone is GMT-5
        int a_time = 00 + time_diff_num;

        if (a_time <0)
        {
            a_time = Math.abs(a_time);
            AM_PM = "PM";
        }else {
            AM_PM = "AM";
        }


        System.out.println("That means that when it is midnight at home it will be "+ a_time + ":00 " + AM_PM +" in your travel destination");

        int b_time = 12 + time_diff_num;
        if(b_time < 12){
            AM_PM = "AM";
        }else{
            AM_PM = "PM";
        }
        System.out.println("and when it is noon at home it will be "+b_time+":00 " + AM_PM);

        System.out.println("*************");
        System.out.println("\n");

    }
    public static void distance(){  //Part4
        Scanner input = new Scanner(System.in);
        //takes in distance between home and destination in square kilometers and
        //converts it into square miles


        System.out.println("What is the square area of your destination country in km2?");
        double km2_sq_area = input.nextDouble();

        //kilmeters*0.62137 = miles
        //Conversion factor: 1 mi² = Square km/2.58998811 km²
        double cal_distance = km2_sq_area/2.58998811;
        System.out.printf("In miles2 that is %.2f %n", cal_distance);


        System.out.println("*************");
        System.out.println("\n");
    }

    public static void cal_distance(){ //Part6

        Scanner input = new Scanner(System.in);

        //maxico city la=19.3910038 ,long=-99.2836971
        System.out.println("Please input your destination latitude and longitude");
        double des_latitude = input.nextDouble();
        double des_longitude = input.nextDouble();

        //home la=35.7958109 ,long=-78.8481106
        System.out.println("Please input your home latitude and longitude");
        double home_latitude = input.nextDouble();
        double home_longitude = input.nextDouble();

        //Calculate using Haversine formula

        double R = 6371.0;

        double distance_cal = (2*R)*(Math.asin((Math.hypot(Math.sin((home_latitude-des_latitude)/2), Math.cos(des_latitude)*Math.cos(home_latitude)* Math.sin((home_longitude-des_longitude)/2) ))));

        System.out.printf("Total distance between your house and destination is %.3f Kilometers %n",distance_cal);

        System.out.println("*************");
        System.out.println("\n");
    }

}
