
public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic=selic;
	}
	
	public void Rodar(Conta2 c){
		System.out.println("Saldo antes de atualizar: "  + String.format("%.2f",c.getSaldo()));
		c.atualizar(this.selic);
		System.out.println("Saldo final : " + String.format("%.2f",c.getSaldo()));
		this.saldoTotal=this.saldoTotal+c.getSaldo();
		
	}
	public double getSaldoTotal(){
		return this.saldoTotal;
	}

}
