package lab3;
import java.util.*;

public class Ex3_3{

	public int[] getSorted(int[] a,int x) {
		for(int i=0;i<x;i++) {
			int k=a[i],d=0,r=0;
			while(k>0) {
				d=k%10;
				r=r*10+d;
				k=k/10;
			}
			a[i]=r;
			
	}
	Arrays.sort(a);
	return a;
}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Ex3_3 a=new Ex3_3();
		int[] s=a.getSorted(arr,n);
		for(int i=0;i<n;i++)
			System.out.print(s[i]+" ");
		sc.close();
	}
}

















/*public class Ex3_3 {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size of arr
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        getready(arr1[],arr2[]);
        getsorted(arr2[]);

    }
    public void getready(int arr1[],int arr2[]){
        int a;int b;String s1="";String s2;String s3;
        for(int j=0;j<arr1.length;j++){
            s2=String.valueOf(arr1[j]);
            for(int z=s2.length()-1;z>=0;z--){
            s1+=s2.charAt(z);
            }
            arr2[j]=s1;
        }

    }
    public void getsorted(int arr[]){
        int size=arr.length;
        int temp;
    	for(int i=0;i<size;i++){
            //int p=Integer.parseInt(arr[i]);
        	for(int j=1;j<size-i-1;j++){
                //int q=Integer.parseInt(arr[j]);
            	if(p>q){
                	temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}*/
