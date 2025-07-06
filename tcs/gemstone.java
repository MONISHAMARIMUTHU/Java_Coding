import java.util.*;

public class gemstone {
    static int count=0;
    public static void gemstone1(int r,int g,int t,String arr,char last){
        if(r==0 && g==0 && t==0){
            count++;
            return;
        }
        if(r>0 && last!='R'){
            gemstone1(r-1,g,t,arr+"R",'R');
        }
        if(g>0 && last!='G'){
            gemstone1(r,g-1,t,arr+"G",'G');
        }
        if(t>0 && last!='T'){
            gemstone1(r,g,t-1,arr+"T",'T');
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int g=sc.nextInt();
        int t=sc.nextInt();
        gemstone1(r,g,t,"",' ');
        System.out.print(count);
    }
}
