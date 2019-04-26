
public class TestarBanco2 {

	public static void main(String[] args) {
		Conta2 c = new Conta2();
		Conta2 c2 = new ContaCorrente();
		Conta2 c3 = new ContaPoupanca();
		
		
		
		c.depositar(1000);
		c2.depositar(2000);
		c3.depositar(3000);
		
		
		Banco2 b = new Banco2();
		
		b.adiciona(c);
		b.adiciona(c2);
		b.adiciona(c3);
		
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		for(int i=0;i<b.pegaTotalDeConta2();i++){
			adc.Rodar(b.getConta2(i));
		}
		
	}

}
