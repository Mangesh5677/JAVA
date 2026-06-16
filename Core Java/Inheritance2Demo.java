class A {
    int add(int n1, int n2) {
        return n1 + n2;
    }
}

class B extends A {
    int sub(int n1, int n2) {
        return n1 - n2;
    }
}  

public class Inheritance2Demo {
    public static void main(String[] args) {
        B obj = new B();
        int sum = obj.add(10, 5);
        int difference = obj.sub(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}