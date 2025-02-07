import java.util.*;
class max_no_ofConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0,maxCount=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++; 
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0; 
            }
        }
        sc.close();
        System.out.print(maxCount);
    }
}