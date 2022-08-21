package lab1;

public class Ex1_3 {
	public static boolean check_num(int num) {
		int last_num = num % 10;
		int prev_num = last_num;
		num = num / 10;
		while (num != 0) {
			if (last_num > prev_num) {
				return false;
			}
			prev_num = last_num;
			last_num = num % 10;
			num = num / 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(check_num(34699));
		System.out.println(check_num(1249568));
	}

}

