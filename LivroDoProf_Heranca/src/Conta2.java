
public class Conta2 {
	private double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void depositar(double n){
		if(n>=0){
			this.saldo+=n;
		}
	}
	
	public void atualizar(double taxa){
		
			this.saldo=this.saldo+(taxa*this.saldo);
	}
	
	
	public boolean sacar(double valor){
		if(valor<this.saldo){
			this.saldo-=valor;
			return true;
		}else{
			return false;
		}
	}
	
}
