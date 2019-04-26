package contas_distintas;

public class ContaPoupanca extends Conta2{
	public void atualizar(double taxa){
		System.out.println("Atualizar de Conta poupança");
		this.saldo=this.saldo+(taxa*this.saldo*3);
	}
}
