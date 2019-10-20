
package Home_Page;

public class Count {

	public static void main(String[] args) {
	 String  st = "this is the most common way.";
	 char somechar ='o';
	 int count =0;
	 for (int i = 0;i<st.length();i++) {
		 if(st.charAt(i) == somechar) {
			 count ++;
		 }
	 }
	 System.out.println("There are "+count +" letter "+somechar +" in " +st);
	}
}
