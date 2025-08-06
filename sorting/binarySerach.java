import java.util.*;

public class binarySerach {
    public static int ls(int[] arr,int k){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==k)
                return mid;
            if(k>arr[mid])
                left=mid+1;
            if(k<arr[mid])
                right=mid-1;
        }
        return -1;
    }

    public static int rs(int[] arr,int low,int high,int k){
        if(low<=high){
            int mid = low+(high-low)/2;   //avoid int overflow
            if(arr[mid]==k)
                return mid;
            if(k>arr[mid])
                return rs(arr,mid+1,high,k);
            else
                return rs(arr,low,mid-1,k);
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(ls(arr,k));
        int low=0,high=n-1;
        System.out.println(rs(arr,low,high,k));
    }
}
