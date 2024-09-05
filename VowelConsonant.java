import java.util.*;
public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        int count1=0,count2=0;
        for (int i = 0; i < n1.length(); i++) {
            char ch = n1.charAt(i);
            char n = Character.toUpperCase(ch);
            if (n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U') {
                count1++;
            } else  {
                count2++;
            }
        }
        System.out.println("Vowels: " + count1);
        System.out.println("Consonants: " + count2);
    }
}
