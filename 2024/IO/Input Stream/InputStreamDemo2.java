import java.util.*;
import java.io.*;

class InputStreamDemo2 {
	public static void main(String[] argv) throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		FileOutputStream myFileOp  = new FileOutputStream("myfile.text");
		char x = 'a';
		myFileOp.write(x);
		myFileOp.close();


		FileInputStream myFileIn = new FileInputStream(new File("myfile.text"));
		System.out.println("Read char: " + (char) myFileIn.read());

		File f1 = new File("myUnfoundFile.java");
		System.out.println(f1.exists());

	}
}
