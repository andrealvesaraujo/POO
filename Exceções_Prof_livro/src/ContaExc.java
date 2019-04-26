
public class ContaExc {

	private double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void depositar(double n){
		if(n>=0){
			this.saldo+=n;
		}else{
			throw new IllegalArgumentException("Vc não pode depositar valor negativo");
		}
	}
	
	public void atualizar(double taxa){
		
			this.saldo=this.saldo+(taxa*this.saldo);
	}
	
	
	public void sacar(double valor) throws ValorInvalidoException{
		if(saldo>=valor){
			this.saldo-=valor;
			
		}else{
			throw new ValorInvalidoException(valor);
		}
	}
	
}
