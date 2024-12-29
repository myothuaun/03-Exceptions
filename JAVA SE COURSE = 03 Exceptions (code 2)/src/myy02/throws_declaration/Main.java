package myy02.throws_declaration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\javatest\\hello.txt");
		try {
			readFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
		}
		System.out.println("continue main method.....");

	}
	public static void readFile(File file) throws FileNotFoundException  {
		
		Scanner sc = new Scanner(file);
		System.out.println("File exist");
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		System.out.println(line1);
		System.out.println(line2);
	}

}
