import java.util.Arrays;
import java.util.Scanner;

public class waveArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+ " ");
        } 
    }
}  
}
