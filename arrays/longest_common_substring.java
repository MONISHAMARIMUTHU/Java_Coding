import java.util.*;
public class longest_common_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int res=0;
        int m=s1.length();
        int n=s2.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int curr=0;
                while((i+curr)<m && (j+curr)<n && s1.charAt(i+curr)==s2.charAt(j+curr)){
                    curr++;
                }
                res=Math.max(res,curr);
            }
        }
        System.out.print(res);
    }
}
