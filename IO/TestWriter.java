package in.co.IO;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestWriter {

	public static void main(String[] args) throws Exception {
//
//		FileWriter f = new FileWriter("C:\\Users\\Dellk\\Desktop\\Test\\Raysians.txt");
//		f.write("hello students");
//		f.write('\n');
//		f.write("this is line ");
//		f.write("this is line2 ");
//		f.close();
//		System.out.println("Done Guy's");
		
		FileWriter f = new FileWriter("C:\\Users\\Dellk\\Desktop\\Test\\Write.txt");
		PrintWriter p = new PrintWriter(f);
		
		for (int i = 0; i < 5; i++) {
			p.println(i+"Vishal ka bday hai guy's");
		}
		f.close();
		p.close();
		System.out.println("Done");
		

	}

}
