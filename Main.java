/*header*/
package calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1,num2,sum,sub,div,mult;
        Scanner in = new Scanner(System.in);
        
        /*inputs*/
        System.out.println("enter a number: ");
        num1 = in.nextDouble();
        
        System.out.println("enter a second number: ");
        num2 = in.nextDouble();
        
        /*calculations*/
        sum = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        /*prints*/
        System.out.println("the sum is: "+sum);
        System.out.println("the subtraction is: "+sub);
        System.out.println("the multiplication is: "+mult);
        System.out.println("the division is: "+div);
        
        
        
        
        
    }
}