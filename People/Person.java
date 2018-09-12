import java.util.Scanner;
public class Person {
	String fist, last, sex;
	int age;
	Scanner inputDevice = new Scanner(System.in);
	
	private getFirstName(){
		first = inputDevice.nextLine();
		System.out.println("The first name is: " + first);
		return first;
	}
	private getLastName(){
		last = inputDevice.nextLine();
		System.out.println("The last name is: " + last);
		return last;
	}
		public getSex(){
		sex = inputDevice.nextLine();
		System.out.println("The sex is: " + sex);
		return sex;
	}
	private getAge(){
		age = inputDevice.nextLine();
		System.out.println("The age is: " + age);
		return age;
	}
	private static void showInfo(){
		
		System.out.println("Firstname: " + first);
		System.out.println("Lastname: " + lst);
		System.out.println("Age: " + age);
		System.out.println("Sex: " + sex);
	}
}