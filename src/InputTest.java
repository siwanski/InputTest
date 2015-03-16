import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class InputTest {

	private static OutputStream out;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int c;
		
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/test.txt")));
			out = new BufferedOutputStream(new FileOutputStream("src/result.txt"));
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
				out.write((char)c);
			}
			in.close();
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
