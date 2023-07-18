import java.util.Scanner;

public class Excersice2{
    public static void main(String[] args) {
        
         Scanner enter = new Scanner(System.in);

         int num1, num2, num3;

         System.out.println( "type a number: ");
         num1 = enter.nextInt();

         System.out.println( " Enter the second number: ");
         num2 = enter.nextInt();

         System.out.println( " Enter the third number: ");
         num3 = enter.nextInt();

         if ( (num1 > num2) && (num2 > num3)){
            System.out.println("order: "+num1+- +num2+ - +num3);

         }else if ( (num1 > num3) && (num3 > num2)){
            System.out.println("order: "+num1+- +num3+ - +num2);

         }else if ( (num2 > num1) && (num1 > num3)){
            System.out.println("order: "+num2+- +num1+ - +num3);

         }else if ( (num2 > num3) && (num3 > num1)){
            System.out.println("order: "+num2+- +num3+ - +num1);

         }else if ( (num3 > num1) && (num1 > num2)){
            System.out.println("order: "+num3+- +num1+ - +num2);

         }else { System.out.println("order: "+num3+- +num2+ - +num1);}
        
    
         }
    }
