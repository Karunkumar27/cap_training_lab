package lab4;

public class Ex4_1 {
	public static int cube_digits_Summ(int n) {
		int summ = 0;
		while (n != 0) {
			summ += Math.pow((n % 10), 3);
			n /= 10;
		}
		return summ;
	}
	
	public static void main(String[] args) {
		System.out.println(cube_digits_Summ(455));

	}
}

