import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TextEditor {
  FileInputStream fileIn;
  FileOutputStream fileOut;
  String fileName;
  char[] inputBuffer;
  TextEditor(String fileName) {
    try {
      this.fileName = fileName;
      this.inputBuffer = new char[1000];
      this.inputBuffer[0] = (char) -1;
      this.fileIn = new FileInputStream(fileName);
      readFileBuffer();
    } catch (FileNotFoundException e) {
      System.err.println("Error: '" + this.fileName + "' File not found");
      System.err.println("Hold on: A new file will be added");
      System.err.println();
    }
  }
  private void outputMode() {
    try {
      if (this.fileIn != null)
        this.fileIn.close();
      this.fileOut = new FileOutputStream(fileName);
      for (int i = 0; this.inputBuffer[i] != (char) -1; i++)
          this.fileOut.write(inputBuffer[i]);
    } catch (FileNotFoundException e) {
      System.err.println("File unable to open for output mode");
      System.err.println(e);
    } catch (IOException e) {
      System.err.println("Error occured while performing closing operation on input stream");
    }
  }
 
  private void readFileBuffer() {
    try {
      int ch, index = -1;
      do {
       ch = this.fileIn.read(); 
       this.inputBuffer[++index] = (char) ch;
       if (ch == -1 ) break;
      } while (true);
    } catch (IOException e) {
      System.out.println("Error occured while reading the file");
    }
  } 
    
  public void readConsole() {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      this.outputMode();
      char ch;
      do {
        ch = (char) br.read();
        if (ch == '~') break;
        this.fileOut.write(ch);
      } while (true);
    } catch (IOException e) {
      System.err.println("Some error occured while writing back to file");
    }
   }
  
   public void printFileContent() {
    for(int i = 0; inputBuffer[i] != (char) -1; i++) {
      System.out.write(inputBuffer[i]);
    }
  } 
}
class TextEditorDemo {
  public static void main(String[] argv) {
    if (argv.length < 1) {
      System.err.println("Error: No file specified");
      System.err.println("TextEditorDemo <filename>");
      return;
    }
    TextEditor t1 = new TextEditor(argv[0]);
    t1.printFileContent();
    t1.readConsole();
  }
}
