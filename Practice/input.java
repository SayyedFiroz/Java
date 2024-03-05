import java.util.Scanner;
import java.util.Arrays;

public class input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Addition of Your two number is " + a+b);

        
        sc.nextLine();//to clear the enter

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your mail id is " +name+"@sx.com");
        //percentage
        int[] marks=new int[5];
        for(int i=0;i<5;i++){
        System.out.println("Enter the Subject " + (i+1));
        marks[i] =sc.nextInt();
        }
        int total =0;
        int percentage;
        for (int i:marks){
            total+=i;
        }
        percentage = total*100/500;

        System.out.println("Your percentage is "+ percentage+"%");
        
    
        





    }
    
}
