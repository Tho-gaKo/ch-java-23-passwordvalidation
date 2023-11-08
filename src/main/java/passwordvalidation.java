import java.util.Scanner;


public class passwordvalidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Create scanner
        System.out.println(" Enter a password ");
        String password = sc.nextLine(); //Read user input
        int length = password.length();
if (pruefer(password, length)){
    System.out.println("valid");

} else {
    System.out.println("invalid");
}

    }

    public static boolean passwordIs8letters(int length) {
        if (length >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasDigits(String password, int length) {
        for (int i = 0; i < length; i++){
            if(Character.isDigit(password.charAt(i))){

                return true;
            }
        }
        return false;
    }
    public static boolean hasUppercaseLetters(String password, int length) {
        for (int i = 0; i < length; i++){
            if(Character.isUpperCase(password.charAt(i))) {

                return true;

            }
        }
        return false;
    }
    public static boolean hasLowercaseLetters(String password, int length) {
        for (int i = 0; i < length; i++){
            if(Character.isLowerCase(password.charAt(i))) {

                return true;
            }
        }
        return false;
    }
    public static boolean pruefer (String password, int length){

        if (hasDigits(password, length)&&hasLowercaseLetters(password, length)&&hasUppercaseLetters(password,length)&&passwordIs8letters(length)&&unusablePasswords(password)) {
            return true;
        } else {
            return false;
        }


}
    public static boolean unusablePasswords(String password) {
            if (!password.equals("passwoRt1") && !password.equals("wortPass10") && !password.equals("Riskofrain2istcool") && !password.equals("Password1") && !password.equals("Aa345678") && !password.contains("1234")&& !password.contains("2345")&& !password.contains("345")&& !password.contains("Passwort")) {
                return true;
            } else {
                return false;
            }
    }
    public static boolean specialChrPassword(String password) {
        for (int i = 0; i < password.length() -1; i++) {
            boolean containsSpecialChars = password.matches(".*[@#$%&+].*");
            if (!containsSpecialChars) {
            return true;
        }
        }
        return false;
    }

    //public static String generateSafePassword(String password) {


  //  }

}










