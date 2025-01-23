import java.util.Scanner;
class NaturalNumbersAndSum{
    public static void main(String[] args){
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of the natural numbers is: " + sum);
    }
}
