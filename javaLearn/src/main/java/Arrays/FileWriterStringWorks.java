package Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStringWorks {

	public static void main(String[] args) throws IOException {
		System.out.println("FileWriter");
		FileWriter fw = new FileWriter("C:\\Users\\Karthick\\Desktop\\test1.txt",true);
		BufferedWriter br = new BufferedWriter(fw);
		br.write("\nSelenium");
        br.close();
	}

}
