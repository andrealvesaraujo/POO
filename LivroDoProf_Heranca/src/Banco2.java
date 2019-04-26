
public class Banco2 {
	private Conta2 contas[] = null;
	private int totalConta=0;
	
	public Banco2()
	{
		contas = new Conta2[5];
	}
	public Banco2(int num)
	{
		contas = new Conta2[num];
	}
	
	public void adiciona(Conta2 c){
		contas[totalConta] = c;
		totalConta++;
	}
	
	public Conta2 getConta2(int x){
		return this.contas[x];
	}
	
	public int pegaTotalDeConta2(){
		return totalConta;
	}
	
}
