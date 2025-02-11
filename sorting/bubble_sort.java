import java.util.Scanner;

public class bubble_sort {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void bubble(int[] arr,int n){
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(swapped==false) break;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            bubble(arr,n);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
