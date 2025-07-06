package tcs;
import java.util.*;

public class t3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int end=0,start=0;
        for(end=0;end<n;end++){
            sum+=arr[end];
            while(sum>k && start <=end){
                sum-=arr[start];
                start++;
            }
            if(sum==k){
                System.out.println((start+1)+" "+(end+1));
                break;
            }
        }
    }
}