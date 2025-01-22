import java.util.Scanner;
class CompareFloat{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a: ");
       float a = sc.nextFloat();
       System.out.print("Enter b: ");
       float b = sc.nextFloat();
       System.out.println("a==b "+(a==b));
       System.out.println("a!=b "+(a!=b));
       System.out.println("a<b "+(a<b));
       System.out.println("a>b "+(a>b));
       System.out.println("a<=b "+(a<=b));
       System.out.println("a<=b "+(a<=b));
    }
}