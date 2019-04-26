
public class ContaCorrente extends Conta{
	public void atualizar(double taxa){
		System.out.println("Atualizar de Conta Corrente");
		super.atualizar(taxa*2);
	}
}	