import java.util.Scanner;
public class CharComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("L1 = ");
        int L1 = sc.next().charAt(0);
        System.out.print("L2 = ");
        int L2 = sc.next().charAt(0);
        System.out.println("Letter Comparison");
        System.out.println(L1+" < "+L2+": "+(L1 < L2));
        System.out.println(L1+"<="+L2+": "+(L1 <= L2));
        System.out.println(L1+">"+L2+": "+(L1 > L2));
        System.out.println(L1+">="+L2+": "+(L1 >= L2));
        System.out.println(L1+"=="+L2+": "+(L1 == L2));
        System.out.println(L1+"!="+L2+": "+(L1 != L2));
    }
}