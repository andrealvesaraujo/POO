package contas_distintas;

public class ContaPoupanca2 implements ContaInterf{
	private double saldo;
	
	@Override
	public void atualizar(double taxa){
		System.out.println("Atualizar de Conta poupança");
		this.saldo=this.saldo+(taxa*this.saldo*3);
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
