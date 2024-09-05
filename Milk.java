import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total amount=");
        int N = sc.nextInt();
        System.out.print("Enter price of plastic bottle=");
        int R1 = sc.nextInt();
        System.out.print("Enter price of glass bottle=");
        int R2 = sc.nextInt();
        System.out.println("Enter return amount=");
        int R3 = sc.nextInt();
        int rem = 0, count=0;

        while (N>R3) {
            if (N >= R1) {
                N -= R1;
                count++;
            } else {
                System.out.println("Not enough money to buy a plastic bottle.");
            }
            if (N >= R2) {
                N -= R2;
                rem += R3;
                count++;
            } else {
                System.out.println("Not enough money to buy a glass bottle.");
            }
        }
        System.out.println(count);
    }
}