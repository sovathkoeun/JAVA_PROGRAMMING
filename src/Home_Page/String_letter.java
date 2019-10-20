package Home_Page;

public class String_letter {

	public static void main(String[] args) {
		String com = "welcome";
		String word1 = com.substring(0,1);
		String word2 = com.substring(1, com.length() - 3);
		String word3 = com.substring((com.length() - 3), com.length()).toUpperCase();
		String store1 = word1 + word2 + word3;
		System.out.print(store1);
	}
}
