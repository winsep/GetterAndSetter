package andvance.dev;

public class Student {
	private String name;
	private int age; 
	private String PhoneNumber;
	private String Address;
	private double Mark;
	
	public Student(String name, int age, String PhoneNumber, String Address, double Mark) {
		this.name = name;
		this.age = age;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
		this.Mark = Mark;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age = age;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public String getPhoneNumber() {
		return this.PhoneNumber = PhoneNumber;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return this.Address = Address;
	}
	public void setMark(double Mark) {
		this.Mark = Mark;
	}
	public double getMark() {
		return this.Mark = Mark;
	}
	public String toString() {
		return "name: "+name+"\nage: "+age+"\nPhoneNumber: "+PhoneNumber+"\nAddress: "+Address+"\nMark: "+Mark;
	}
   public static void main(String[] args) {
	   Student student = new Student("Hậu", 19, "0997008070", "Quảng Trị", 7.6);
	   System.out.println(student);
   }
}
