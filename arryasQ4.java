//Take a mitrix as input from the user.Search for a given number x and print the indices at which it occurs.
import java.util.Scanner;

public class arryasQ4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at locations{"+i+","+j+"}");
                }
            }
        }


    }
}
