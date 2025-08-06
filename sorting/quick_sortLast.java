import java.util.Scanner;

public class quick_sortLast {

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int[] arr,int low,int high){
        int sptr,fptr=low-1;
        int pivot=arr[high];
        for(sptr=low;sptr<high;sptr++){
            if(arr[sptr]<=pivot){
                fptr++;
                swap(arr,fptr,sptr);
            }
        }
        swap(arr,fptr+1,high);
        return fptr+1;
    }

    public static void qSort(int[] arr,int low,int high){
        if(low<high){
            int partIdx = partition(arr,low,high);
            qSort(arr,low,partIdx-1);
            qSort(arr,partIdx+1,high);
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
        qSort(arr,low,high);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
