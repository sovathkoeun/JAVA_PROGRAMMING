package Home_Page;

public class Stringeven {

	public static void main(String[] args) {
		
		String letter1 = "programing";
		String letter2 = "homework";
		String letter3 = "marker";
		String index1 = letter1.substring(0,5);
		String index2 = letter2.substring(0,4);
		String index3 = letter3.substring(0,3);
	
		System.out.println(index1 + " " + "is the first half of programming");
		System.out.println(index2 + " " + "is the first half of Homework");
		System.out.println(index3 + " " + "is the first half of marker");		
	}
}
