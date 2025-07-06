package tcs;
import java.util.*;

public class removechar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(b.indexOf(a.charAt(i))==-1){
                sb.append(a.charAt(i));
            }
        }
        System.out.println(sb.toString());
       
    }
}
