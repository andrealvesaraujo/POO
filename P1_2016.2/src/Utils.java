
public class Utils {
	public int[] alterarVetor(boolean v[]){
		int novo[] = new int[v.length];
		
		for(int i =0 ; i < v.length ; i++){
			if(v[i] == true){
				novo[i]=1;
			}else{
				novo[i]=0;
			}
		}
		
		return novo;
	}
	//instanceof
	public static String inverter(String str){
		String invertida ;
		
		
		char palavra[] = str.toCharArray();
		char aux;
		for(int i =0;i<palavra.length/2; i++){
			aux=palavra[i];
			palavra[i]=palavra[palavra.length - i - 1];
			palavra[palavra.length - i - 1]=aux;
		}
		invertida = new String(palavra);
		/*for(int i = str.length()-1 ; i>=0 ; i--){
			invertida+=str.charAt(i);
		}
		*/
		System.out.println(invertida);
		return invertida;
	}
}
