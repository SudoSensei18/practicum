package whretg;
import java.util.Scanner;
public class factoriel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

	}
	public static int factrec (int n) {
		if(n>=1) {
		return n*factrec(n-1);
		}
	}
	else {
		return 1;
	}
}
