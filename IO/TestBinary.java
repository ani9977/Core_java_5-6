package in.co.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		String source = "C:/Users/Dellk/Desktop/Test/Image1.jpg";
		String target = "C:/Users/Dellk/Desktop/Test/AlooParatha.jpg";

		FileInputStream f = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = f.read();
		while (ch != -1) {
			out.write(ch);
			ch = f.read();
		}
		f.close();
		out.close();
		System.out.println("done");

	}

}
