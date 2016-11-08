public class oddcounter {
	public static void main (String [] args) {
		String output = "";
		for (int i=1; i<=100; i++) {
			if (i%2 ==1)
				output += "\n" +i;
		}
		System.out.print(output);
	}
}
