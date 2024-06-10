package in.co.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyBoard {

	public static void main(String[] args)throws Exception {

		InputStreamReader isreader = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isreader);

		PrintWriter out = new PrintWriter(new FileWriter("C:/Users/Dellk/Desktop/Test/Keyboard.txt"));

		String line = bf.readLine();
		while (!line.equals("quit")) {
			out.println(line);
			line = bf.readLine();
		}
		bf.close();
		out.close();

	}

}
