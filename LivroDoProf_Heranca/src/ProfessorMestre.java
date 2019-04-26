
public class ProfessorMestre extends Professor {
	private String dataConclusaoMestrado;

	public String getDataConclusaoMestrado() {
		return dataConclusaoMestrado;
	}

	public void setDataConclusaoMestrado(String dataConclusaoMestrado) {
		this.dataConclusaoMestrado = dataConclusaoMestrado;
	}
	
	public void calcularSalario()
	{
		double valor = this.valorHora*1.2;
		this.salario=valor* this.horasDeAulaMes;
		System.out.println("Sobreescrita");
	}
}
