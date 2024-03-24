import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

class InputStreamDemo {

	public static void main(String[] argv) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		if (argv.length < 1) {
			System.out.println("Please supply a valid filename");
			return;
		}
		try {
			FileOutputStream myFile = new FileOutputStream(argv[0]);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				char ch = (char) br.read();
				if (ch == '~') break;
				myFile.write(ch);
			}

			BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(argv[0])));
			while (true) {
				char ch = file.read();
				if (ch == -1) break;
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			System.out.println("File not exist adding a new file");
		}
	}
}
