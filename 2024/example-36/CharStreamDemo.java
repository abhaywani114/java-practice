import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CharStreamDemo {
    public static void main(String[] argv) throws IOException {
        System.out.println("Let us read a character from your console:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
