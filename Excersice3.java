import java.util.Scanner;

public class Excersice3 {
    public static void main(String[] args) {
         Scanner enter = new Scanner(System.in);
         int  sam, claudia, jose, total;


          System.out.println("how much money does sam have?: ");
          sam = enter.nextInt();

          claudia = sam / 2;
          jose = sam + claudia;
          total = sam + claudia +jose;

          System.out.println(" is total of the three is : " + total);

          
    }
}
