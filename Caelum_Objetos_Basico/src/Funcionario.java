
public class Funcionario {
	String nome;String dep;
	double sal; Data entrada = new Data();
	String rg;
	
	public void recebeAumento(double num){
		this.sal=num+sal;
		
	}
	public double calculaganhoanual(){
		return this.sal * 12;
	}
	public void mostra()
	{
		
		System.out.println("nome : "+this.nome);
		System.out.println("dep : "+this.dep);
		
		System.out.println("sal : "+this.sal);
		System.out.println("rg : "+this.rg);
		System.out.println("Data de Entrada : "+this.entrada.formatada());
		
	}
}
