
public class PoupancaExc extends ContaExc{
	public void atualizar(double taxa){
		System.out.println("Atualizar de Conta poupan�a");
		super.atualizar(taxa*3);
	}
}