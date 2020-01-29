public class starString_recusive {

    public static void main(String[] args){

        //starString(0);

        System.out.println(starString(0));

    }

    public static String starString(int n){

        String x;

        if(n==0){

            x="*";

            return x;
            
        }
        else if(n<0){
            throw new IllegalArgumentException();

        }else {

            x = starString(n-1);

            return x+x;
        }
        
    }


}
