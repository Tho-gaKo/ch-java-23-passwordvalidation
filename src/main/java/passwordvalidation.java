import java.util.Scanner;


public class passwordvalidation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Create scanner
        System.out.println(" Enter a password ");

        String password = sc.nextLine(); //Read user input
        System.out.println(" Password is: " + password);


    }
    public static boolean passwordIs8letters(String password) {
        String sevenLetter = "TheCook";

        boolean is8Letters = false;

        if (sevenLetter.length() < password.length()) {
            is8Letters = true;

        }
        if (is8Letters) {
            return true;
        }
    return false;
    }
    public static boolean passwordContainsNumber(String password) {
        String hasNumber = "benching405";

        boolean containsNumber = false;


        if (containsNumber.){
            containsNumber = true;
        }
        if (containsNumber) {
            return true;
        }
        return false;
    }
    public class containsNumber{
        public static void main(String[] args) {
            String hasNumber = "benching405";
            char[] chars = hasNumber.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : chars) {
                if(Character.isDigit(c)){
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }


}
