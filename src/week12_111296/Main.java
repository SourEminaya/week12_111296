	package week12_111296;
import java.io.*;
public class Main {
	public static void writeSerializedObject(){
		Person person = new Person("John doe", 22, "UMN");
		try {
			FileOutputStream fileOut= new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(person);
			System.out.println("Serialized data written");
		} catch (IOException e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeSerializedObject();
	}

}
