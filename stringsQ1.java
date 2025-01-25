
//Q1. TAKE AN ARRAY OF STRINGS INPUT FROM THE USER & FIND THE CUMULATIVE (COMBINED)LENGTH OF ALL THOSE STRINGS.

import java.util.*;
public class stringsQ1 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int size =sc.nextInt();

    String array[] = new String[size];

    int totaLength = 0;

    for(int i=0; i<size; i++){
        array[i] = sc.next();
        totaLength += array[i].length();
    }

    System.out.println(totaLength);
}
}