class calculator {
   public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    } 

}

class AdvancedCAlculator extends calculator {
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0; 
        }
    }
}



public class InheritanceDemo {
    public static void main(String[] args) {
        AdvancedCAlculator advCalc = new AdvancedCAlculator();
        
        int sum = advCalc.add(10, 5);
        int difference = advCalc.subtract(10, 5);
        int product = advCalc.multiply(10, 5);
        int quotient = advCalc.divide(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    
    }
}
