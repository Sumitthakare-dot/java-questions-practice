//Q3. INPUT AN EMAIL FORM THE USER. YOU HAVE TO CREATE A USERNAME FROM THE EMAIL BY DELETING THE PART THAT COMES AFTER '@
//DISPAY THAT USERNAME TO THE USER.
import java.util.Scanner;

public class stringsQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        String userName = " "  ;


        for(int i=0; i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;

            }else{
                userName+= email.charAt(i);
            }
        }

        System.out.println(userName);
    }
}
