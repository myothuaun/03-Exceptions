package myy04.multiple_exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class MyReader {
	public void myFile(File file) throws Exception {
		int number = 1;
		if(number == 1) {
			FileNotFoundException ex = new FileNotFoundException("file ma shi par");
			throw ex;
		}
		if(number == 2) {
			ClassNotFoundException ex = new ClassNotFoundException("class ma shi par");
			throw ex;
		}
		System.out.println("continue process .........");
	}

}
