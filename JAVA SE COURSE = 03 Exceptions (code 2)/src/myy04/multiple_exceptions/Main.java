package myy04.multiple_exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\javatest\\hello.txt");
		MyReader read = new MyReader();
		
		try {
			read.myFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
