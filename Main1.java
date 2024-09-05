
import java.util.*;
public class Main1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bi=sc.nextInt();
        int size=sc.nextInt();
        int zi[] = new int[size];

        for(int i=0;i<size;i++)
        {
            zi[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            bi = bi-((zi[i]%2)+(zi[i]/2));
        }
        System.out.println(bi);
        if(bi>0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}