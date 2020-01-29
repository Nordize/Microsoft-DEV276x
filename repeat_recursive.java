public class repeat_recursive {


    public static void main(String[] args){



        System.out.println(repeat("hello",3));

    }

    public static String repeat(String s, int n){

        String x;

        if(n<0){
            throw new IllegalArgumentException();
        }else if(n == 0){
            x = "";
            return x;
        }else {


            x = repeat(s, n-1);
            //System.out.println(x);
            return s+x;
        }
    }
}
