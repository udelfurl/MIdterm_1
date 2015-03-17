package main;
import java.util.Scanner;
public class Student extends Person {
	private final String class_status;
	public Student(String class_status){
		Scanner stu=new Scanner(System.in);
		System.out.println("Enter you class status(Freshman,Sophmore,Junior,Senior): ");
		class_status= stu.toString();
		this.class_status=class_status;
				}
	public String getClassStatus(){
		return class_status;
	}
	public String Student(String name, String phone,String address, String email){
		return "name,phone,address,email";
	}

}