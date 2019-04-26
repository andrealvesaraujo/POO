
public class TestaAtualizadorDeContas {
	
	public static void main(String args[]){
		Conta2 c = new Conta2();
		Conta2 cc = new ContaCorrente();
		Conta2 cp = new ContaPoupanca();
	
		c.depositar(1000);
		cc.depositar(1000);
		cp.depositar(1000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.Rodar(c);
		adc.Rodar(cc);
		adc.Rodar(cp);
		
		System.out.println("Total de saldos finais: " +adc.getSaldoTotal());
	}
	
}
