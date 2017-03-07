import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndReadFromFile {
	public static void main(String[] args) throws IOException {
		File naty = new File("naty" + File.separator + "naty.txt");
		File copy = new File("naty" + File.separator + "natyCopy.txt");
		naty.createNewFile();
		copy.createNewFile();
		String text = "Today is not one of my best days! I hate it ";
		BufferedOutputStream bot = new BufferedOutputStream(new FileOutputStream(naty));
		char[] arr = text.toCharArray();
		try {
			for (char c : arr) {
				bot.write(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bot.flush();
				bot.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// InputStream is = new ByteArrayInputStream(text.getBytes());
		// BufferedInputStream buffIn = new BufferedInputStream(is);
		FileReader in = new FileReader(naty);
		BufferedReader br = new BufferedReader(in);
		BufferedOutputStream buffOut = new BufferedOutputStream(new FileOutputStream(copy));
		int b = br.read();
		while (b != -1) {
			buffOut.write(b);
			b = br.read();
		}
		buffOut.flush();
	}

}
