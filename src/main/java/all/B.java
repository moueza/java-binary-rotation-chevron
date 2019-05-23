package all;

/** binary rotation 
 * https://stackoverflow.com/questions/25847191/new-to-java-trying-to-understand-checker-1-val*/
public class B {
	public static boolean isUniqueChars(String str) {
		boolean checker[] = new boolean[str.length()];
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';
			if (checker[val])
				return false;
			checker[val] = true;
		}
		return true;
	}

}
