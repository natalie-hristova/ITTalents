import java.io.File;
import java.io.IOException;

public class CreatingFile {
	public static void main(String[] args) {
		File f = new File("."+ File.separator+"naty");
		f.mkdirs();
		File f1 = new File("naty"+ File.separator+"naty.txt");
		File f2 = new File("naty"+ File.separator+"naty2.txt");
		try {
			f1.createNewFile();
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (File file : f.listFiles()) {
			System.out.println(file.getName());
		}
		
	}

}
