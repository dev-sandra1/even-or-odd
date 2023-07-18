import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        int num1;
        int num2;
        boolean close = false;

        do {
            System.out.println("say the first number: ");
        num1 = enter.nextInt();

        System.out.println("Enter the second number:");
        num2 = enter.nextInt();

        if(num1 == num2){
            System.out.println("the numbers are even:D ");

        }else{
            System.out.println("the numbers are not even:C");
            close = true;
        }

        } while (!close);
    }
}