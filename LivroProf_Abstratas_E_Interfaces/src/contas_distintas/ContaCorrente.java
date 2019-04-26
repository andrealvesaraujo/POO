package contas_distintas;

public class ContaCorrente extends Conta2 implements Tributavel{
	public void atualizar(double taxa){
		System.out.println("Atualizar de Conta Corrente");
		this.saldo=this.saldo+(taxa*this.saldo*2);
	}
	public void depositar(double valor){
		if(valor >= 0.1){
			super.depositar(valor-0.1);
			
		}
	}
	@Override
	public double calcularTributo() {
		return this.saldo*0.01;
	}
}
