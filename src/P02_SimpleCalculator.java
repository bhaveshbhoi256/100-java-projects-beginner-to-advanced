// 2. Simple Calculator (add, sub, mul, div)

import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator, Choose one of these: ");
        System.out.println("1.Addition , 2.Subtraction, 3.Multiplication, 4.Division");
        Scanner myObj = new Scanner(System.in);
        Integer a = myObj.nextInt();

        System.out.println("Enter first number");
        Scanner myObj1 = new Scanner(System.in);
        Integer b = myObj1.nextInt();

        System.out.println("Enter second number");
        Scanner myObj2 = new Scanner(System.in);
        Integer c = myObj2.nextInt();

        int d;

        switch(a){
            case 1:
            d = b+c;
            System.out.println( "the addition is " + d);
            break;

            case 2:
            d = b-c;
            System.out.println( "the subtraction is " + d);
            break;

            case 3:
            d = b*c;
            System.out.println( "the multiplication is " + d);
            break;

            case 4:
            d = b/c;
            System.out.println( "the division is " + d);
            break;
        }
        
        myObj.close();
        myObj1.close();
        myObj2.close();
    }
}
