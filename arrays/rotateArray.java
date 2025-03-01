
import java.util.Scanner;


public class rotateArray {
    static void rotate(int[] arr,int n,int k){
        k = k % n;
        while(k!=0){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        k--;
        }
    }
    static void rotateArr(int[] arr, int n,int k) {
        k = k % n; // to handle cases where k is greater than n
        if (k < 0)
            k = n + k; // convert negative rotations to positive
        
        reverse(arr, 0, k - 1); // reverse the first part
        reverse(arr, k, n - 1); // reverse the second part
        reverse(arr, 0, n - 1); // reverse the whole array
    
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            rotate(arr,n,k); //TC : O(n*k);
            //rotateArr(arr,n,k); //TC : O(n) by using Reversal algorithm
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+ " ");
            }
        }

    }
}
