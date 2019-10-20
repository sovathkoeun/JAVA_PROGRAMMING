

package Home_Page;

public class Google {

	public
	static void main(String[] args) {
	String string ="www.google.com/";
	if(string.contains("/")) {
		String answer = string.replace("/", "/wep2020");
		System.out.println(answer);
	}else {
		System.out.println(string+" deos not end with /");
	}
  }
}
