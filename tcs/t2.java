package tcs;
import java.util.*;

public class t2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max_c=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int count=0,sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>k){
                    max_c=Math.max(max_c,count);
                    break;
                }
                 count++;
            }
        }
        System.out.println(max_c);
    }
}