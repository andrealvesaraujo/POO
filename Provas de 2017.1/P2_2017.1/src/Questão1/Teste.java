package Questão1;

public class Teste {
	public static void main(String args[]){
		String s = "arara";
		if(Palindromo(s)){
			System.out.println("É palindromop");
		}
	}
	public static boolean Palindromo(String s){
		
		char c[] = s.toCharArray();
		for(int i=0;i<(s.length()/2);i++){
			int valor=(s.length()-i-1);
			if(c[i]!=c[valor]){
				return false;
			}
		}
		return true;
	}
}
