package lab5;

import java.util.Scanner;

public class Ex5_4 {

	public static void main(String[] args) throws exception{
		Scanner sc=new Scanner(System.in);
		String firstname=sc.nextLine();
		String lastname=sc.nextLine();
		//String middlename=sc.nextLine();
		sc.close();
		if(firstname=="" || lastname=="") {
			throw new exception("please enter last name and first name");
		}
		else {
			System.out.println("Name is valid!");
		}

	}

}