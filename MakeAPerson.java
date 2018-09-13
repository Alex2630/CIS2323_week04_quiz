import java.util.Scanner;
// import People.*;
public class MakeAPerson{
	public static void main(String[] args){
		Scanner inputDevice = new Scanner(System.in);
		String First, Last,sex;
		int age;
		Person myPerson= new Person();
		First = inputDevice.nextLine();
		Person.getFirstName(First);
		Last = inputDevice.nextLine();
		Person.getLastName(Last);
		age = inputDevice.nextLine();
		Person.getAge(age);
		sex = inputDevice.nextLine();
		Person.getSex(sex);
		Person.showInfo();
	}
	
}