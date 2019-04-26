
public class TestDeposita {
	public static void main(String[] args){
		ContaExc cp = new PoupancaExc();
		
		try{
			
			
			cp.sacar(150);
	
		}
		catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		}
		
	}
}
