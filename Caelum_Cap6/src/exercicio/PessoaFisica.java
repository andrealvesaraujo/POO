package exercicio;

public class PessoaFisica {
	private String CPF;
	
	public PessoaFisica(String c)
	{
		setCpf(c);
	}
	public void setCpf(String n)
	{
		if(validar(n))
		{
			this.CPF=n;
		
		}
		else{
			System.out.println("Cpf digitado é invalido");
		}
		
	}
	private  boolean validar(String x){
		//Algoritmo
		return true;
	}
}
