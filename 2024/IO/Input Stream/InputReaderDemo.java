import java.io.*;
import java.util.*;

class InputReaderDemo {
	public static void main(String[] argv) throws IOException {
		FileWriter myFile = new FileWriter("mynewfile.text");
		myFile.write("Abrar has this new file");
		myFile.close();
		FileReader myFile2 = new FileReader("mynewfile.text");
		char[] ch = new char[1000];
		myFile2.read(ch);
		System.out.printf("File content: ");
		for(int i = 0; i < ch.length; i++)
			System.out.print(ch[i]);
	}
}
