package lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Ex7_1 {
	public List get_Values(HashMap map) {
		List temp = new ArrayList<>(map.values());
		Collections.sort(temp);
		return temp;
	}
	public static void main(String[] args) {
		Ex7_1 ex1 = new Ex7_1();
		HashMap hm1 = new HashMap();
		hm1.put("H", 1);
		hm1.put("e", 5);
		hm1.put("l", 2);
		hm1.put("o", 8);
		hm1.put("w", 1);
		hm1.put("r", 9);
		hm1.put("d", 5);
		System.out.println(ex1.get_Values(hm1));
	}
}