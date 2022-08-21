package lab7;

import java.util.HashMap;



public class Ex7_2 {
	public HashMap<Character, Integer> countCharacter(char[] arr) {
		HashMap<Character, Integer> CCount = new HashMap<Character, Integer>();
		for (char character : arr) {
			if (CCount.containsKey(character)) {
				CCount.put(character, CCount.get(character) + 1);
			}else {
				CCount.put(character, 1);
			}
		}
		return CCount;
	}
	public static void main(String[] args) {
		Ex7_2 ex2 = new Ex7_2();
		char[] arr = "HelloWorld".toCharArray();
		System.out.println(ex2.countCharacter(arr));
	}
}