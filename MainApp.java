package andvance.dev;
import java.util.Scanner;

public class MainApp {
	private String name;
	private int age;
	private double Mark;
	private String Address;
	private String PhoneNumber;
	
	public MainApp(String name, int age, double Mark, String Address, String PhoneNumber) {
		this.name = name;
		this.age = age;
		this.Mark = Mark;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(String name) {
		return this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(int age) {
		return this.age = age;
	}
	public void setMark(double Mark) {
		this.Mark = Mark;
	}
	public double getMark(double Mark) {
		return this.Mark = Mark;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress(String Address) {
		return this.Address = Address;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
    public String getPhoneNumber(String PhoneNumber) {
    	return this.PhoneNumber = PhoneNumber; 
    }
    public String toString() {
    	return "name: "+name+"\nage: "+age+"\nMark: "+Mark+"\nAddress: "+Address+"\nPhoneNumber"+PhoneNumber; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhập số lượng Sinh viên: ");
     int n = sc.nextInt();
     MainApp[] student = new MainApp[n];
      input(student);
      for(int i = 0; i < student.length; i++) {
    	  System.out.println("Sinh viên thứ: "+(i+1)+":" +student[i]);
      }
    
	}
	public static void input(MainApp[] student) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < student.length; i++) {
			System.out.println("Nhập vào số sinh viên "+(i+ 1)+":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.println("Mark: ");
			double Mark = sc.nextDouble();
			System.out.print("Address: ");
			String Address = sc.nextLine();
			System.out.print("PhoneNumber: ");
			String PhoneNumber = sc.nextLine();
			student[i] = new MainApp(name, age, Mark, Address, PhoneNumber);
		}
		sc.close();
	}

}
