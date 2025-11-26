package week12_111296;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
public class File_Handling {
	public static void main (String[] args) {
	try {
		File obj = new File ("myfile.txt");
		if(obj.createNewFile()) {
			System.out.println("Success creating file");
		} else {
			System.out.println("File already created");
		}
	} catch (IOException e) {
		System.out.println("Error Occured");
		e.printStackTrace();
		
	}
	
	try {
		File obj2 = new File ("myfile.txt");
		Scanner sc=new Scanner(obj2);
		while (sc.hasNextLine()) {
			String data=sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	} catch (IOException e) {
		System.out.println("Error");
		e.printStackTrace();
	}
	
	try {
		FileWriter wr = new FileWriter("myfile.txt");
		wr.write("Nama saya John Doe\nSaya dari universitas multimedia nusantara\n");
		wr.close();
		System.out.println("Success");
	} catch (IOException e) {
		System.out.println("Error Occured");
		e.printStackTrace();
		
	}

}
}
