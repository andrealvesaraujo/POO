import java.util.*;
//ArrayList é ruim para pesquisa(get())
public class VelocidadeDeListas {
	public static void main(String[] args){
		System.out.println("iniciando...");
		long inicio = System.currentTimeMillis();
		
		ArrayList<Integer> A = new ArrayList<Integer>(); 
		//HashSet<Integer> H = new HashSet<Integer>();
		int total=30000;
		for(int i=0;i<total;i++){
			A.add(i);
			//H.add(i);
			
		}
		for(int i=0;i<total;i++){
			//H.contains(i);
			A.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo=fim-inicio;
		System.out.println("tempo: " + tempo);
	}
}
