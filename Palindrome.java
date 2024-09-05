import java.util.*;
public class Palindrome {
public static void main(String[] args){
    int i;
    String c="";
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    for(i=s1.length()-1;i>=0;i--){
        char a=s1.charAt(i);
        c += a;
    }
    if(c.equals(s1)){
        System.out.println("Palindrome");
    }
    else System.out.println("Not palindrome");

}
}
