package week12_111296;
import java.io.File;
import java.io.IOException;
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

}
}
