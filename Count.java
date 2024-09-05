import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0,a=0,rem;
        int n=sc.nextInt();
        int org=n;
        while(n>0){
            count++;
            n/=10;
        }
        n=org;
        for(int i=0;i<=count;i++){
            rem=n%10;
            a+=Math.pow(rem,count);
            n/=10;
        }
        if(org==a){
            System.out.println("Armstrong number");
        }
        else System.out.println("Not armstrong");
    }
}
