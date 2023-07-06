package calculator2;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter number 1 for sum");
        System.out.println("enter number 2 for subtract");
        System.out.println("enter number 3 for multiplicate");
        System.out.println("enter number 4 to divide");
        int i = in.nextInt();
        
        System.out.println("enter the first number: ");
        double num1 = in.nextDouble();
        
        System.out.println("enter the second number: ");
        double num2 = in.nextDouble();
        
        if(i == 1){
            System.out.println(num1+num2);
        }else{
            if(i == 2){
                System.out.println(num1-num2);
            }else{
                if(i == 3){
                    System.out.println(num1*num2);
                }else{
                    if(i == 4){
                        System.out.println(num1/num2);
                    }else{
                        System.out.println("invalid operation");
                    }
                }
            }
        }
    }
}