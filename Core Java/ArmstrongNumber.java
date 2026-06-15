import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num =  sc.nextInt();
        int orignal = num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum = sum +(digit * digit * digit);
            num = num /10;
        }
        if(sum==orignal){
            System.out.println("Armstrong Number:"+orignal);
        }else{
            System.out.println("Not a Armstrong Number:"+orignal);
        }
    }
}