import java.util.Scanner;

/* programme utilisant la classe utilisaire Scanner et le branchement if 
 * date: 10.05.2021
 * author: Chancerel Codjovi (aka codrelphi)
 */

public class IfScanner {
	
	public static void main(String[] args) {
		int a, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a == 5) c = a + 1;
		else c = a - 1;
		System.out.println(c);
	}

}

