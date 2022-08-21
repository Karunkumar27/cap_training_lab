package lab3;
import java.util.*;
public class Ex3_2 {
	public static String[] Alphabatic_sort(String[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		String[] arr = {"World", "Hello", "me", "hi", "apple", "Ball"};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Alphabatic_sort(arr)));
	}
}

