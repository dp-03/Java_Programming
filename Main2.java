import java.util.Scanner;
public class Main2{
    public static int countclimingways(int n,int i, int x)
    {
        int[]ways=new int[n+1];
        ways[i]=1;
        ways[i-1]=1;
        for(int i=i+1;i<=n;i++){
            ways[i]=0;
            for((int j=1;j<=x)&&(int i-j>=i;j++))
            {
                ways[i]+=ways[i-j];
            }
        }
        return ways[n];
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,i,x;
        n= sc.nextInt();
        i=sc.nextInt();
        x=sc.nextInt();
        int numways = countclimbingways(n,i,x);
        System.out.println(numways);
}