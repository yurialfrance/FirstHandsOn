//Code by: Egipto, Yuri Alfrance G. BSIT 1-1

package handsOnPackage;
import java.util.Scanner;
//lalagyan po ng class na scanner to input value ni user

public class handsOn {

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static int multiplication(int a, int b) {
        int result = a * b;
        if (result == 0) {
            return -1;
        }
        return result;
    }

   
    public static float division(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return (float) a / b;
    }


    public static int subtraction(int a, int b) {
        if (a == 0 || a < b) {
            return -1;
        }
        return a - b;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        //gagamit po ng for loop to determine kung primenumber or not 

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        
        System.out.println(" ----------------------------------");
        System.out.println("|    Select a method to perform:   |");
        System.out.println("|        1. Addition +             |");
        System.out.println("|        2. Subtraction -          |");
        System.out.println("|        3. Multiplication x       |");
        System.out.println("|        4. Division /             |");
        System.out.println(" ----------------------------------");
        System.out.println("Method: ");
        int choice = scan.nextInt();
        float result = 0;
//        Using switch po to determine anong operation 
//        gusto ni user then call the operation funtion
        switch (choice) {
            case 1:
                result = addition(num1, num2);
                break;
            case 2:
                result = subtraction(num1, num2);
                break;
            case 3:
                result = multiplication(num1, num2);
                break;
            case 4:
                result = division(num1, num2);
                break;
            default:
                System.out.println("Sorry wrong method :(");
                break;
        }

        if (result == -1) {
            System.out.println("Error Please Try again");
        } else {
            System.out.println("Result: " + result);
            
            System.out.println(" ----------------------------------");
            System.out.println("|        Let us see if it is       |");
            System.out.println("|        a Prime number or not     |");
            System.out.println(" ----------------------------------");

            if (isPrime((int) result)) {
                System.out.println(": Yes, it is a prime number");
            } else {
                System.out.println(": No, it is not a prime number");
            }
        }
    }
}
