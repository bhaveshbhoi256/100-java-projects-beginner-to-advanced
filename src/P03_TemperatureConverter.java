// 3. Temperature Converter (Celsius ↔ Fahrenheit)

import java.util.Scanner;

public class P03_TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Enter Temprature ,1.C => F, 2.F => C");
        Scanner myObj = new Scanner(System.in);
        Integer a = myObj.nextInt();
        
        int c;
        switch(a){
            case 1:
            System.out.println("Enter the Temprature (Celcius): ");
            Scanner myObj1 = new Scanner(System.in);
            Integer b = myObj1.nextInt();
            c= b * 9/5 + 32;
            System.out.println("Celsius => Fahrenheit : "+ c);
            break;

            case 2:
            System.out.println("Enter the Temprature (Fahrenheit): ");
            Scanner myObj2 = new Scanner(System.in);
            Integer d = myObj2.nextInt();
            c= (d -32) * 5/9;
            System.out.println("Fahrenheit => Celsius : "+ c);
            break;
        }
        myObj.close();
    }
}
