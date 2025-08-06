import java.util.Scanner;

public class selection_sort {

    public static void swap(int arr[],int i,int min){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
    }

    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            swap(arr,i,min);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
