import java.util.Scanner;
class AddThreeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number:");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The total sum of the three numbers is: " + sum);
    }
}