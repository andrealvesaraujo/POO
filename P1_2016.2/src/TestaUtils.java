
public class TestaUtils {

	public static void main(String[] args) {
		Utils n = new Utils();
		boolean v[] ={false,false,true,false,true,true,false,false,true,false};
		String s  = "troca";
		
		Utils.inverter(s);
		
		
		int novo[] ;
		
		novo = n.alterarVetor(v);
		for(int i=0;i<novo.length;i++){
			System.out.printf("%d -> ",novo[i]);
		}
		System.out.println();
		
	}

}
