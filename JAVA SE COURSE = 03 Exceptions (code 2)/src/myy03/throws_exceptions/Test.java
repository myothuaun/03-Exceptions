package myy03.throws_exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Test {
	public void myFile(File file) throws FileNotFoundException {
		if(file.exists()) {
			System.out.println("file is exist");
		}else {
			FileNotFoundException f =new FileNotFoundException("file ma shi par");
			throw f;
		}
	}

}
