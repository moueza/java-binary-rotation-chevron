package myPack;

/** binary rotation */
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
