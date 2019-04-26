import java.util.ArrayList;
import java.util.List;
public class Passagem {
	private static ArrayList a = new ArrayList();
	public static void metodoA(int value){
		value = 439;
		System.out.println(value);
	}
	public static void metodoB (List c){
		c.add("casa");
	}
	public static void metodoC (List a){
		a=new ArrayList();
		a.add("janela");
	}
	public static void testaNum(Integer numero) {
	numero = numero + 10;
	}
	public static void metodoAssento1(Assento s) {
	s.setCor("marrom");
	}
	public static String metodoAssento2(Assento s) {
		s = new Assento("rosa");
		return s.getCor();	
	}
	public static void main (String args []){
		Assento s = new Assento("verde");
		metodoAssento1(s);
		System.out.println(s.getCor());
		System.out.println(metodoAssento2(s));
		System.out.println(s.getCor());
		a.add("carro");
		a.add("cama");
		Integer numeroMagico = 553;
		testaNum(numeroMagico);
		int numeroMagico2 = 11;
		testaNum(numeroMagico2);
		System.out.println(numeroMagico);
		System.out.println(numeroMagico2);
		metodoA(numeroMagico2);
		System.out.println(numeroMagico2);
		metodoC(a);
		metodoB(a);
		System.out.println(a);
	}
}