import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println("Sum: " + result);
    }
}