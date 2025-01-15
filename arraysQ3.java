// Take an array of numbers as input check if it is array sorted in ascending order.
import java.util.Scanner;

public class arraysQ3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int numbers[]= new int[size];
        
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        boolean isAscendig = true;

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i]>numbers[i+1]){
                isAscendig = false;
            }
        }

        if(isAscendig){
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
