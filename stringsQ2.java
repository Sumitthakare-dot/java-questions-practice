//Q2. INPUT A STRING FROM THE USER. CREATE A NEW STRING CALLED RESULT IN WHICH YOU WILL REPLACE THE LETTER 'E'IN ORIGINAL STRING WITH LETTER 'I'.

import java.util.*;

public class stringsQ2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String result =" ";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== 'e'){
                result += 'i';
            }else{
                result += str.charAt(i);

            }
        }

        System.out.println(result);
    }

    
}
