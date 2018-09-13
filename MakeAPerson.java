import java.util.Scanner;
//import People.*;
public class MakeAPerson{
	public static void main(String[] args){
		Scanner inputDevice = new Scanner(System.in);
		String First, Last,sex;
		int age;
		Person myPerson= new Person();
		First = inputDevice.nextLine();
		myPerson.getFirstName(First);
		Last = inputDevice.nextLine();
		myPerson.getLastName(Last);
		age = inputDevice.nextInt();
		myPerson.getAge(age);
		sex = inputDevice.nextLine();
		myPerson.getSex(sex);
		myPerson.showInfo();
	}
}	