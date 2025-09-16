package two_Pointer;
import java.util.*;
public class longest_palin_substring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        int n=s.length();
        int start =0;
        int maxLen=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=1;j++){
                int low=i;
                int high=i+j;
                while(low>=0 && high <n && s.charAt(low)==s.charAt(high)){
                    int currlen=high-low+1;
                    if(currlen>maxLen){
                        start=low;
                        maxLen=currlen;
                    }
                    low--;
                    high++;
                }
            }
        }
        System.out.println(s.substring(start,start+maxLen));
    }
}
