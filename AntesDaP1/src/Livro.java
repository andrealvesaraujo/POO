
public class Livro extends Loja{
	private String autor;
	
	public Livro(String cod){
		super(cod);
	}
	public Livro(String c,String n,double v,String au){
		super(c,n,v);
		this.autor=au;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString(){
		return "Livro:" +super.toString() + " , " + this.autor;
	}
	
	
}
