
import java.util.*;
public class factttt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number=");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        if(fact%10!=0){
            System.out.print(fact%10);
        }
        else{
            while(fact%10==0){
                fact/=10;
                System.out.print(fact%10);
            }
        }
    }
}