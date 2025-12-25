// 4. Even or Odd checker

import java.util.Scanner;

public class P04_EvenOddChecker {
    public static void main(String[] args) {
         System.out.println("Enter the number: ");
        Scanner myObj = new Scanner(System.in);
        Integer a = myObj.nextInt();
        if(a%2==0){
            System.out.println("The number is EVEN");
        }
        else{
            System.out.println("The number is ODD");
        }
        myObj.close();
    }
}
