package tcs;
import java.util.*;

public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[0])
                count++;
        }
        System.out.println(count);
    }
}
