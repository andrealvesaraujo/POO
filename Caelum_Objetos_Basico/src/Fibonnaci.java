
public class Fibonnaci{
	public int calcularFibonnaci(int i)
	{
		return i-1 > 1 ? calcularFibonnaci(i-1) + calcularFibonnaci(i-2) : 1;
		
	}
	
	
	public static void main(String[] args){
		int i;
		Fibonnaci F = new Fibonnaci();
		
		for(i=1;i<=6;i++){
			int resultado;
			resultado = F.calcularFibonnaci(i);
			System.out.print(resultado + " ");
		}
	}
}
