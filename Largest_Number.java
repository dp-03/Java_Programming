import java.util.*;
public class Largest_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.print("Array size=");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Array elements=");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]);
        }
    }
}
