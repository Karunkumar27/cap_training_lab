package lab1;
import java.util.*;
public class Ex1_2 {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        Ex1_2 a = new Ex1_2();
        System.out.println(a.calculateDifference(n));
        sc.close();
    }
    public double calculateDifference(int n){
        double sum1=0;int sum2=0;double a;
        for(int i=1;i<=n;i++){
            sum1+=(i*i);
            sum2+=i;
        }
        a=Math.pow(sum2,2);
        return sum1-a;
    }
}
