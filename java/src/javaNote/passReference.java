package javaNote;

public class passReference {
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
