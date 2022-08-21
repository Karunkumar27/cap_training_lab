package lab1;

public class Ex1_1 {
		public static int Sume_of_range(int n) {
			int summ = 0;
			for (int i=1; i<=n; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					summ += i;
				}
			}
			return summ;
		}
		
		public static void main(String[] args) {
			System.out.println(Sume_of_range(10));
		}
	}

