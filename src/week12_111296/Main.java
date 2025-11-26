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
	
	public static void readSerializedObject() {
		Person person = null;
		try (FileInputStream fileIn = new FileInputStream("person.ser"); ObjectInputStream in = new ObjectInputStream (fileIn)){
			person =(Person) in.readObject();
			
		}catch (IOException i) {
			System.out.println("Error Occured");
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
		}
		System.out.println("Deserialized Person...\nName: "+person.getName()+"\nAge: "+person.getAge()+"\nCampus: "+person.getCampus());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeSerializedObject();
	}

}
