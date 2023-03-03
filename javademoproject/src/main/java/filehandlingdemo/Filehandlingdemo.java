package filehandlingdemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Filehandlingdemo {
	public static void main(String[]args) {
		fileInputStreamDemo();
	}
	static void fileInputStreamDemo() {
		int i;
		File myfile=new File("C:\\Users\\debm\\Documents\\hi.txt");
		try {
			FileInputStream fis=new FileInputStream(myfile);
			System.out.println("File opened");
			System.out.println("--------");
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			fis.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
