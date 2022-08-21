package lab1;

//import java.lang.*;

import java.util.*;

public class Ex1_4{
	public static boolean power_of_two(int n) {
		if (n < 2) {
			return false;
		}
		while (n > 2) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(power_of_two(x)) {
			System.out.println(x +" is power of 2");
		}
		else {
			System.out.println(x +" is not a power of 2");
		}
		sc.close();
	}
}