import java.util.*;
public class lcm_gcd {
    public static int lcm(int a,int b){
        int max=Math.max(a,b);
        while (true) {
            if(max%a==0 && max%b==0)
                return max; 
           max++; 
        }
    }
    public static int gcd(int a,int b){
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        return gcd;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(lcm(a,b));
        System.out.print(gcd(a,b));
    }

}
