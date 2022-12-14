package whretg;
import java.util.Scanner;
public class fibby {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
		System.out.println(fibrec(i)+ " ");
		}
	}
	public static int fibrec(int n) {
		if(n<=0 || n==1) {
			return 1;
		}
		else {
			return fibrec (n-1)+fibrec(n-2);
		}
	}
}
