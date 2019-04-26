
public class ContaCorrente extends Conta2{
	public void atualizar(double taxa){
		System.out.println("Atualizar de Conta Corrente");
		super.atualizar(taxa*2);
	}
	public void depositar(double valor){
		if(valor >= 0.1){
			super.depositar(valor-0.1);
			
		}
	}
}
