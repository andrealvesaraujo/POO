import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//LinkedList é melhor para  inserção do que o ArrayList
//O ArrayList é melhor para pesquisa
public class Comparacao {
	public static void main(String args[]){
		T1();
		T2();
	}
	public static void T1(){ 
		long inicio,fim;
		double tempo;
		System.out.println("Iniciando com LinkedList...");
		inicio=System.currentTimeMillis();
		List<Integer> lista=new LinkedList<Integer>();
		for(int i=0;i<100000;i++){
		lista.add(0, i);
		}
		fim=System.currentTimeMillis();
		tempo=(fim-inicio)/1000.0;
		System.out.println("Tempo gasto com LinkedList: "+tempo);
		System.out.println("#################################");
		System.out.println("Iniciando com ArrayList...");
		inicio=System.currentTimeMillis();
		lista=new ArrayList<Integer>();
		for(int i=0;i<100000;i++){
		lista.add(0, i);
		}
		fim=System.currentTimeMillis();
		tempo=(fim-inicio)/1000.0;
		System.out.println("Tempo gasto com ArrayList: "+tempo);
	}
	public static void T2(){ 
		long inicio,fim;
		double tempo;
		System.out.println("Iniciando com LinkedList...");
		inicio=System.currentTimeMillis();
		List<Integer> lista=new LinkedList<Integer>();
		for(int i=0;i<30000;i++){
		lista.add(i);
		}
		for(int i=0;i<30000;i++){
		lista.get(i);
		}
		fim=System.currentTimeMillis();
		tempo=(fim-inicio)/1000.0;
		System.out.println("Tempo gasto com LinkedList: "+tempo);
		System.out.println("#################################");
		System.out.println("Iniciando com ArrayList...");
		inicio=System.currentTimeMillis();
		lista=new ArrayList<Integer>();
		for(int i=0;i<30000;i++){
		lista.add(i);
		}
		for(int i=0;i<30000;i++){
		lista.get(i);
		}
		fim=System.currentTimeMillis();
		tempo=(fim-inicio)/1000.0;
		System.out.println("Tempo gasto com ArrayList: "+tempo);
	}
}
