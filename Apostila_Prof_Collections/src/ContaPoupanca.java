
public class ContaPoupanca extends Conta{
	public void atualizar(double taxa){
		System.out.println("Atualizar de Conta poupança");
		super.atualizar(taxa*3);
	}
}
