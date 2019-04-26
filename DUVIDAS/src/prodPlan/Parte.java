package prodPlan;

public abstract class Parte{
	protected int codigo;
	protected String nome;
	protected String descricao;
	protected float valor;

	public Parte(int codigo,String nome,String desc,float valor){
		this.codigo = codigo;
		this.nome=nome;
		this.descricao = desc;
		this.valor =valor;


	}
	public Parte(){
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public abstract String toString();

	public boolean equals(Object o){
		if(o instanceof Parte){
			if(this.codigo==((Parte)o).codigo && (this.nome==((Parte)o).nome) &&  (this.valor==((Parte)o).valor) && (this.descricao==((Parte)o).descricao)){
				System.out.println("É a mesma parte");
				return true;
			}else{
				System.out.println("É outra parte");
				return false;
			}
			
		}else{
			return false;
		}
	}


}