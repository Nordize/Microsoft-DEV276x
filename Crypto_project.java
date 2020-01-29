public class Crypto_project {

    public static void main(String[] args){
        //take in string to be encrypted

        //normalizeText("This is some \"really\" great. (Text)!?");
        //System.out.println(ceasarify("ILIKEAPPLES",-1));

        //System.out.println(groupify("HITHERE", 2) );

        System.out.print(encryptString("This is some \"really\" great. (Text)!?",2,2));

        //return text;
    }

    public static String normalizeText(String s){

        String normalizeText = s.replaceAll("\\p{P}", "").toUpperCase().replaceAll("\\s","");

        System.out.println("Original is "+normalizeText);

        return normalizeText;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String ceasarify(String s,int n){

        String ceasarifiedText = "";

        int length = s.length();

        char c,cipherChar;

        for(int i=0;i<length;i++){

            c = s.charAt(i);

            //System.out.println(c);
            //if c is letter ONLY then shift them.
            if(Character.isLetter(c) ){

                    cipherChar =  (char)(s.charAt(i)+n);

                    if(cipherChar > 'Z'){
                        cipherChar = (char) (cipherChar -26);
                    }
                ceasarifiedText = ceasarifiedText + cipherChar;
                }

            }



        return ceasarifiedText;
    }

    public static String groupify(String s, int n){

        String padding = "x";

        if(s.length()/n >0){
            return s.substring(0,n)+" "+ groupify(s.substring(n),n);
        }else{
            if(s.length() % n ==0){
                return s;
            }else{
                for(int i=1;i<(n-s.length());i++){
                    padding = padding + "x";
                }
                return s+padding;
            }
        }


    }

   public static String encryptString(String text,int shif_val, int group_size){

        String normalizeText = normalizeText(text);
        String encryptedText = ceasarify(normalizeText,shif_val);
        String groupifiedText = groupify(encryptedText,group_size);
        return groupifiedText;
    }


}
