import java.util.*;
public class diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter no:");
	int n = sc.nextInt();
	for (int i = 0; i < n; i++) {
            	for (int j = 0; j < n-i-1; j++) {
                	System.out.print("  ");
            	}

            	for (int k = 0; k < i*2+1; k++) {
                	System.out.print("* ");
            	}
        		System.out.println();
       	 }
       	 for (int i = 1; i < n; i++) {
           		for (int j = 0; j < i; j++) {
                 	System.out.print("  ");
            	}

           		for (int k = 0; k < (n-i)*2-1; k++) {
                	System.out.print("* ");
           		 }
        		System.out.println();
       	 }
    }

}