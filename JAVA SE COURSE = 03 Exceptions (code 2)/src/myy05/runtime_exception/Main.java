package myy05.runtime_exception;

public class Main {
	public static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int x = 4 / 0;
		System.out.println(x);
		}catch(ArithmeticException e) {
			System.out.println("arithmetic error");
			e.printStackTrace();
		}
		
		
		try {
		int [] number = {1,2,3};
		System.out.println(number[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arrays index out of bound");
			e.printStackTrace();
		}
		
		
//		name = "myo";
		try {
//		if(name != null) {
		System.out.println(name.length());
//		}
		}catch(NullPointerException e) {
			System.out.println("null");
			e.printStackTrace();
		}
	}

}
