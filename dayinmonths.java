public class dayinmonths {

    public static void main(String[] args){

        daysInMonth(1);
        daysInMonth2(1);
    }

    public static int daysInMonth(int month) {
        if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static int daysInMonth2(int month){

        if((month == 1) || (month ==3) || (month ==5) || (month ==7) || (month ==8) || (month ==10) || (month ==12)){
            //System.out.println("days in month is 31");
            return 31;
        }else if((month == 4) || (month ==6) || (month ==9) || (month ==11)){
            //System.out.println("days in month is 30");
            return 30;

        }else{
            //System.out.println("Feb has only 28 days");
            return 28;
        }

    }





}
