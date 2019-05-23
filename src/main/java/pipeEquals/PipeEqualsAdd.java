package pipeEquals;

/** ie += n : no : + bit by bit */
public class PipeEqualsAdd {
	public static void main(String[] args) {
		int i = 1;
		i |= 15;
		System.out.println(i);
		i = 1;
		i |= 1;
		System.out.println(i);
	}

}
