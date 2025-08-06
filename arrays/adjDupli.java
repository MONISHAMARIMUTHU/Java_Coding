
import java.util.*;

public class adjDupli {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                c++;
            }
        }
        int[] arr1=new int[n+c];
        int j=n+c-1;
        for(int i=arr.length-1;i>=0;i--){
            arr1[j--]=arr[i];
            if(arr[i]==k){
                arr1[j--]=k;
            }
        }
         for(int i=0;i<n;i++){
            System.out.print(arr1[i]);
        }
    }
}

// public static ArrayList<Integer> duplicateK(ArrayList<Integer> arr, int k) {      ---> In ArrayList
//         int n = arr.size();
//         for (int i = 0; i < n; i++) {
//             if (arr.get(i) == k) {
//                 // Insert an adjacent k
//                 arr.add(i + 1, k);
//                 i++;

//                 // Remove the last element
//                 arr.remove(arr.size() - 1);
//             }
//         }
//         return arr;
//     }
//  public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 0, 4, 5, 0));
//         int k = 0;
//         ArrayList<Integer> ans = duplicateK(arr, k);

//         for (int num : ans) {
//             System.out.print(num + " ");
//         }
//     }
// }
