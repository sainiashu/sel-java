package logs;

public class exceptionhandling {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void demo() throws Exception {
		
		System.out.println("Hell World...");
		throw new ArithmeticException("not a valid operation"); 
//		int i = 1/0;
//		System.out.println("completed");
		
	}
}
