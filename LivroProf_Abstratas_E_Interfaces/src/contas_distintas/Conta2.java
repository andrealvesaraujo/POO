package contas_distintas;

public abstract class Conta2 {
	protected double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void depositar(double n){
		if(n>=0){
			this.saldo+=n;
		}
	}
	
	public abstract void atualizar(double taxa);
	
	
	public boolean sacar(double valor){
		if(valor<this.saldo){
			this.saldo-=valor;
			return true;
		}else{
			return false;
		}
	}
	public boolean transferir(Conta2 destino,double num)
	{
		boolean s = this.sacar(num);
		if(s){
			destino.depositar(num);
			return true;
		}
		else
			return false;
		
		
	}
	
}
