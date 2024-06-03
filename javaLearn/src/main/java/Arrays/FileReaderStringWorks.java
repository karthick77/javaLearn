package Arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderStringWorks {

	public static void main(String[] args) throws IOException {
		System.out.println("File Reader");
		FileReader reader = new FileReader("C:\\Users\\Karthick\\Desktop\\test1.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String data = null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}

		br.close();
	}

}
