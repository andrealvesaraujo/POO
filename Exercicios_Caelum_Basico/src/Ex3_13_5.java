
public class Ex3_13_5 {
		public static void main(String[] args){
			int ant=0;
			int novo=1;int fib=0;
			for(int i=0;fib<=100;i++){
				fib=ant+novo;
				System.out.println(fib);
				ant=novo;
				novo=fib;
			}
		}
}
