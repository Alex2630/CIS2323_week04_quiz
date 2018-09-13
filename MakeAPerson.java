import java.util.Scanner;
// import People.*;
public class MakeAPerson{
	public static void main(String[] args){
		Scanner inputDevice = new Scanner(System.in);
		String First, Last,sex;
		int age;
		Person myPerson= new Person();
		First = inputDevice.nextLine();
		getFirstName(First);
		Last = inputDevice.nextLine();
		getLastName(Last);
		age = inputDevice.nextLine();
		getAge(age);
		sex = inputDevice.nextLine();
		getSex(sex);
		showInfo();
	}
	
}