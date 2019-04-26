
public class Substitui {
	public static void processa (String str){
		str=str.toUpperCase();
		System.out.println(str);
		str=str.replace("A","4");
		str=str.replace("E","3");
		str=str.replace("I","1");
		str=str.replace("O","0");
		System.out.println(str);
		
	}
	public static void main(String[] args){
		processa("paralelismo");
	}
}
