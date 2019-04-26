
public class Conta {
	int numero;
	double saldo;
	Cliente cliente;
	
	
	void depositar(double valor){
		saldo=saldo+valor;
	}
	void sacar(double valor){
		if(saldo > 0){
			
			System.out.println("Saca");
			saldo=saldo-valor;
		}
		else{
			System.out.println("Não tem saldo");
		}
	}
}
