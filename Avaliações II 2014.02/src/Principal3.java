import java.util.Scanner;
public class Principal3 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String str;
		str = in.next();
		int[] A = new int[1];
		System.out.println(A.length);
		System.out.println(A[0]);
		while(!str.equals("fim")){
			int n = Integer.parseInt(str);
			ordenaArrayPares(n,A);
			
			
			
			str = in.next();
		}
		
		
	}
	public static void ordenaArrayPares(int num,int[] A){
		int[] B = A;
		A = new int[A.length+1];
		
		
		
		
		
		
	}
}
