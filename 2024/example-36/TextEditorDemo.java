import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class TextEditorDemo {
  public static void main(String[] argv) throws IOException {
    System.out.println("Your text editor: ");
    String  textBuffer[] = new String[10];
    int usedBuffer = -1;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    do {
      textBuffer[++usedBuffer] = br.readLine();
    } while(!textBuffer[usedBuffer].equals("stop"));

    System.out.println();
    System.out.println("Text that we have read: ");
    
    for(int i = 0; i < usedBuffer; i++)
      System.out.println(textBuffer[i]);
  }
}
