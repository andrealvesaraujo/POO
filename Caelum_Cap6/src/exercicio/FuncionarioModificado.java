package exercicio;

public class FuncionarioModificado {
	private String nome;
	private String dep;
	private double sal; 
	private DataModificado entrada = new DataModificado();
	public DataModificado getEntrada() {
		return entrada;
	}
	public void setEntrada(DataModificado entrada) {
		this.entrada = entrada;
	}
	private String rg;
	private int ident;
	private static int total=0;
	
	public FuncionarioModificado()
	{
		ident=++FuncionarioModificado.total;
	}
	public FuncionarioModificado(String nome)
	{
		this.nome=nome;
		ident=++FuncionarioModificado.total;
	}
	
	public void recebeAumento(double num){
		this.sal=num+sal;
		
	}
	public double getGanhoanual(){
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
	public int getIdent(){
		return this.ident;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String n){
		this.nome=n;
	}
	
	public String getDep(){
		return this.dep;
	}
	public void setDep(String n){
		this.dep=n;
	}
	
	public double getSal(){
		return this.sal;
	}
	public void setSal(double num){
		this.sal=num;
	}
	

	public String getRG(){
		return this.rg;
	}
	public void setRG(String n){
		this.rg=n;
	}

	
}
