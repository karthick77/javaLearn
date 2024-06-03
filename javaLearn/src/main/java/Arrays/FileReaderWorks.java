package Arrays;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderWorks {
	public static void main(String[] args) throws IOException {
		System.out.println("File Reader");
		FileReader reader = new FileReader("C:\\Users\\Karthick\\Desktop\\test1.txt");
		int line;
		while ((line = reader.read()) != -1) {
			System.out.print((char) line);
		}
		reader.close();
	}
}
