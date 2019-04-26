public class TesteContas2 {
	public static void main(String[] args){
		Conta2 contas[] = new Conta2[5] ;
		
		for(int i=0;i<5;i++){
			if(i==2 || i==4){
				contas[i]=new Conta2();
				contas[i].depositar(2050.50);
			}else if(i==1 || i==3){
				contas[i] = new ContaCorrente();
				contas[i].depositar(1200.05);
			}
			else{
				contas[i] = new ContaPoupanca();
				contas[i].depositar(250.50);
			}	
		}
		for(int j=0;j<contas.length;j++){
			if(contas[j].sacar(500)){
				System.out.println("Conseguiu sacar.Novo saldo : " + String.format("%.2f",contas[j].getSaldo()));
			}
			else{
				System.out.println("Não foi possivel sacar.Saldo inalterado!!");
			}
		}
		for(Conta2 x: contas){
			if(x instanceof ContaCorrente){
				@SuppressWarnings("unused")
				ContaCorrente cc = (ContaCorrente) x;
				System.out.println("Conta corrente atualiza");
				x.atualizar(10);
				
			}
			else if(x instanceof ContaPoupanca){
				System.out.println("Conta Poupança atualiza");
				x.atualizar(10);
				
			}
			else{
				System.out.println("Conta normal atualiza");
				x.atualizar(10);
			}
			System.out.println("Resultado " + x.getSaldo());
		}
		
		
	}
	
}
