package lab5;
import java.util.*;
public class Ex5_3 {
	
		public boolean is_Prime(int n) {
			if (n == 1 || n == 0) {
				return false;
			}
			for (int i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		public void primeInteger(int n) {
			for (int i=1; i < n; i++) {
				if (is_Prime(i)) {
					System.out.print(i + " ");
				}
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Ex5_3 e3 = new Ex5_3();
			System.out.print("Enter a range value : ");
			
			e3.primeInteger(sc.nextInt());
			sc.close();
		}

	}