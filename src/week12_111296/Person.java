package week12_111296;
import java.io.Serializable;
public class Person implements Serializable{
	private static final long serialVersionUID=1L;
	private String name;
	private int age;
	private String campus;
	public Person(String name, int age, String campus) {
		this.age=age;
		this.name=name;
		this.campus=campus;
	}
	public String toString() {
		return "Person{name='" +getName()+"'age='"+getAge()+"' campus='"+getCampus()+"'}";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	

}
