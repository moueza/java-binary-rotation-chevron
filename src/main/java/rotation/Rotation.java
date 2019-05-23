package rotation;

public class Rotation {
	public static void main(String[] args) {
		int i = 5;//0000101
		int v = 1 << i;
		int v2 = 1 << v;
		int v3 = 1 << v2;
		System.out.println(v);
		System.out.println(v2);
		System.out.println(v3);

		System.out.println("******************");

		i = 1;
		v = 1 << i;
		v2 = 1 << v;//100
		v3 = 1 << v2;//10000
		System.out.println(v);
		System.out.println(v2);
		System.out.println(v3);
	}
}
