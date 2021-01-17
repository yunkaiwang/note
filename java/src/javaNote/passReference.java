package javaNote;

public class passReference {
	/**
	 * Expected output is 'hellohelloworld' without any space since Java is pass by value,
	 * so line 19 doesn't actually changed the original msg string
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "hello";
		print(msg);
		msg += "world";
		print(msg);
	}
	
	public static void print(String msg) {
		System.out.print(msg);
		msg += " ";
	}
}
