import java.util.*;

public class merge_sort {

    static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }   
    }

    static void merge(int[] arr,int low,int mid,int high){
        int k=low;
        int i=low;
        int j=mid+1;
        int[] temp=new int[arr.length];
        while(i<=mid && j<=high){
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];
            else    
                temp[k++]=arr[j++];
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(int a=low;a<=high;a++){
            arr[a]=temp[a];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=n-1;
        mergeSort(arr,low,high);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
