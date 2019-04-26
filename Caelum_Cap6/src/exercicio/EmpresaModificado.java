package exercicio;
//Fazer setters/getters
public class EmpresaModificado {
	private String nome;private String cnpj;
	private FuncionarioModificado[] empregados;
	private int pos = 0;
	
	
	public EmpresaModificado()
	{
		this.empregados = new FuncionarioModificado[200];
	}
	public EmpresaModificado(int tamanho)
	{
		this.empregados = new FuncionarioModificado[tamanho];
	}
	
	public void adiciona(FuncionarioModificado F){
		
		if(pos < this.empregados.length){
			
			this.empregados[pos] = F;
			this.pos++;
		}
		else{
			System.out.println("Cheio");
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public FuncionarioModificado getFuncionario(int posicao) {
		return this.empregados[posicao];
	}
	public int getPos() {
		return pos;
	}
	
	public void mostraEmpregados()
	{
		for(int i =0;i<empregados.length ; i++){
			if(empregados[i] != null){
				empregados[i].mostra();
			}
		}
	}
	public boolean contemFunc(FuncionarioModificado F){
		for(FuncionarioModificado e: empregados)
		{
			if(e == F)
			{
			
				return true;
			}	
		}
		return false;
	}
	
	public void setEmpregados(FuncionarioModificado[]  num){
		if(this.empregados.length<num.length){
			this.empregados = num;
			System.out.println("Aumentou o tamanho do vetor");
		}
		else
		{
			System.out.println("N pode diminuir tamanho do vetor");
		}
		
	}
}
