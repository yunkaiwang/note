package javaNote;

public class tryCatch {
	/**
	 * It won't compile since the Runtime Exception has been handled so the program can
	 * never reach line 15
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("A");
		} catch(Exception e) {
			System.out.println("B");
		} catch(RuntimeException e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}
}
