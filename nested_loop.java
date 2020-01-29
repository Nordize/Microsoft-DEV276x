public class nested_loop {

    public static void main(String[] args){

        /*for (int i=1; i<=7 ;i++){

            for (int j =1;j<=i;j++)
            {
                System.out.print(i);

            }

            System.out.println();
        }*/

        for (int i =0 ; i<3;i++){
            for( int j=0;j<10;j++){
                for(int k=0;k<3;k++){

                    System.out.print( j);
                }

            }
            System.out.println();

        }


    }

}
