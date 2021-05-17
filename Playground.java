/* juste pour tester quelques codes java 
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 11.05.2021
 *
 */

public class Playground {

	public static void main(String[] args) {

		byte b = 127; // 1 octet
		System.out.println("b = " + b);

		byte b1 = 127; // 1 octet
		System.out.println("b1 = " + b1);

		short s = 1207; // 2 octet
		System.out.println("s = " + s);
		
		boolean b$ = true; // 1 bit
		System.out.println("b$ = " + b$);

		int i_v = 4578; // 4 octet
		System.out.println("i_v = " + i_v);

		long l12_£45 = 15; // 8 octet
		System.out.println("l12_£45 = " + l12_£45);

		float f = 8.4f;
		float f2 = 2.9F;
		double d = 5;
		double d2 = 5.5d;
		double d3 = 5.4D;
		float f3 = 2.9e-2f;
		float f4 = (float) 2.9e-2;
		double d4 = 2.9e-2;
		var val1 = 'c';
		var val2 = 2.1e-4f;
		System.out.println("val1 = " + val1 + "\n" + "val2 = " + val2);
		char c1 = '1';
		char c2 = '2';
		System.out.println("c1 = " + c1 + "\n" + "c2 = " + c2);
		int v1 = 2, v2= 4;
		int tmp = v1;
		System.out.println("v1 = " + v1 + "\t" + "v2 = " + v2);
		v1 = v2;
		v2 = tmp;
		System.out.println("v1 = " + v1 + "\t" + "v2 = " + v2);
	}
}
