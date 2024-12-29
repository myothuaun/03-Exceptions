package myy03.throws_exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\javatest\\hello.txt");
		
		Test test = new Test();
		try {
			test.myFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println (e.getMessage());
			e.printStackTrace();
		}

	}

}
