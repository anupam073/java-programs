//Program to Print 1 to 50 & replace all ones with "a".

package String;

public class Logic1 {
	public static void main(String srgs[]) {
		int i;
		for (i = 0; i <= 50; i++) {
		
			String str = String.valueOf(i);
			str = str.replace("1", "a");
			System.out.println(str);
		}

	}

}
