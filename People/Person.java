import java.util.Scanner;
public class Person {
	String fist, last, sex;
	int age;
	Scanner inputDevice = new Scanner(System.in);
	
	private void getFirstName(String first){
		//first = inputDevice.nextLine();
		System.out.println("The first name is: " + first);
		//return first;
	}
	private void getLastName(String last){
		//last = inputDevice.nextLine();
		System.out.println("The last name is: " + last);
		//return last;
	}
	private void getSex(String sex){
		//sex = inputDevice.nextLine();
		System.out.println("The sex is: " + sex);
		//return sex;
	}
	private void getAge(int age){
		//age = inputDevice.nextLine();
		System.out.println("The age is: " + age);
		//return age;
	}
	private static void showInfo(){
		
		System.out.println("Firstname: " + first);
		System.out.println("Lastname: " + last);
		System.out.println("Age: " + age);
		System.out.println("Sex: " + sex);
	}
}