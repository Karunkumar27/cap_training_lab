package lab5;
import java.util.*;
public class Ex5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose any one of the following :  'red', 'yellow' or 'green'.");
		System.out.print("Enter the choosen option :");
		String color = sc.nextLine();
		if (color.equals("red")) {
			System.out.println("Stop");
		}else if (color.equals("yellow")) {
			System.out.println("Ready");
		}else if (color.equals("green")) {
			System.out.println("Go");
		}else {
			System.out.println("Incorrect Input.");
		}
		sc.close();
	}
}

