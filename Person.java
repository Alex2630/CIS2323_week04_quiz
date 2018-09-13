import java.util.Scanner;
//package People;
public class Person {
	private String first, last, sex;
	private int age;
	Scanner inputDevice = new Scanner(System.in);
	
	public String getFirstName( String first ){
		//first = inputDevice.nextLine();
		System.out.println("The first name is: " + first);
	return first;
	}
	public String getLastName( String last ){
		//last = inputDevice.nextLine();
		System.out.println("The last name is: " + last);
		return last;
	}
	public String getSex( String sex){
		//sex = inputDevice.nextLine();
		System.out.println("The sex is: " + sex);
		return sex;
	}
	public int getAge(int age){
		//age = inputDevice.nextLine();
		System.out.println("The age is: " + age);
		return age;
	}
	public void showInfo(){
		
		System.out.println("Firstname: " + first);
		System.out.println("Lastname: " + last);
		System.out.println("Age: " + age);
		System.out.println("Sex: " + sex);
	}
}
