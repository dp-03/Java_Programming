import java.util.*;
public class Fib {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=-1,b=1,count=0;
        int n=sc.nextInt();
        int c;
        while(n>=count) {
            c = a + b;
            System.out.println(c);
            a=b;
            b=c;
            count++;
        }

    }
}
