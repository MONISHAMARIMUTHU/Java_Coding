package tcs;
import java.util.*;

public class reAvL {
    static int[] arr;
    static void reeval(int x,int y,int n){
        arr[x-1]=y;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i])
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        while(k!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            reeval(x,y,n);
            k--;
        }
    }
}

// 5  -->n
// 3  -->k
// 1 4 3 4 2  O/P:5 3 5
// 1 3   -->x y
// 3 4
// 3 2
