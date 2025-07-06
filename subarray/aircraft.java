package subarray;
import java.util.*;

public class aircraft {
    public static int count(int arr[],int k,int n){
        int count=0,i=0,j=n-1;
        Arrays.sort(arr);
        while(i<=j){
            if(arr[j]>k){
                return -1;
            }
            if(arr[i]+arr[j]<=k){
                i++;
                j--;
            }
            else
                j--;
            
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(count(arr,k,n));
    }
}

// An array of weights: [3, 3, 5, 2, 1, 4, 5, 1, 5]

// Maximum allowed weight per aircraft: k = 5

// Each aircraft can carry at most two people, and the total weight must be ≤ 5.

// We need to find the minimum number of aircrafts needed to carry all people.

