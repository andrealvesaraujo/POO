package contas_distintas;

public class ContaCorrente2 implements ContaInterf{
	private double saldo;
	
	public void atualizar(double taxa){
		System.out.println("Atualizar de Conta Corrente");
		this.saldo=this.saldo+(taxa*this.saldo*2);
	}
	public void depositar(double valor){
		if(valor >= 0){
			this.saldo+=(valor-0.01);
			
		}
	}
	@Override
	public void sacar(double valor) {
		if(this.saldo >= valor){
			this.saldo-=valor;
			
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}

}
