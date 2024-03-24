import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringCharDemo {
  public static void main(String[] args) throws IOException{
    System.out.println("Let us read lines form console:");
    String in;
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    do {
        in = br.readLine();
        System.out.println("Read: "+ in);
    } while(!in.equals("stop"));
  }   
}