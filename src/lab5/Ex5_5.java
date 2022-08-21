package lab5;

import java.util.Scanner;

public class Ex5_5 {

	public static void main(String[] args) throws exception{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();sc.close();
			if(age>=15) {
				System.out.println("valid age!");
			}
			else {
				throw new exception("age should be above 15!");
			}
		
	}}

