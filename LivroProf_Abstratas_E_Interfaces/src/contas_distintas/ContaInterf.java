package contas_distintas;

public interface ContaInterf {
	public double getSaldo();
	public void depositar(double n);
	public void atualizar(double taxa);
	public void sacar(double valor);
}
