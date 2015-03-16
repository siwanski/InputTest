import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 */

/**
 * @author Szymon Iwa�ski
 *
 */
public class InputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int c;
		
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while((c = in.read()) >= 0) {
				System.out.println((char)c);
			}
			in.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
