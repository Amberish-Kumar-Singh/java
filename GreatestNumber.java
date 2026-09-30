import java.util.Scanner;

public class GreatestNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the thre numbers separated by spaces . We will print the greatest among them");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if(num1>num2){
            if(num1>num3)
                System.out.println("Greatest number is "+num1);
            else 
                System.out.println("Greatest number is "+num3);
        }
        else{
            if(num2>num3)
                System.out.println("Greatest number is "+num2);
            else
                System.out.println("Greatest number is "+num3);
        }

    }
}