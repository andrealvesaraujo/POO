import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public abstract class Loja {
	private String nome,codigo;
	private double preco;
	
	
	public Loja(String c){
		this.codigo = c;
	}
	public Loja(String c,String n,double v){
		this.codigo = c;
		this.nome=n;
		this.preco=v;
	}
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean equals(Object o){
		
		if(o instanceof Loja){
			Loja L = (Loja) o;
			return (L.codigo).equals(this.codigo);
		}
		
		
		return false;
	}
	public String toString(){
		return this.nome + " , " + this.preco;
	}

	public static int procurar(Loja L , List a){
		
		int ind = a.indexOf(L);
		if(ind == -1){
			System.out.println("Não tem");
		}
		
		return ind;
	}
	public static void main(String[] args){
		List l = new ArrayList();
		//List l2 = new ArrayList();
		Loja l1 = new Livro("abc","Saber",15.5,"Daniel");
		
	
		l.add(l1);
		l.add(new CD("xyz","JUREG",200,10));
		l.add(new DVD("fbv"));
		l.add(new DVD("osl","Emoji",5.5,3.5));
		
		Loja c1 =new CD("xyz");
		Loja c2 = new CD("sdofdofdso");
		
		System.out.println(l);
		System.out.println(Loja.procurar(c2, l));
		
		
		
		
		
		
		
		/*int ind = l.indexOf(new DVD("abc"));
		if(ind > -1){
			Loja L= (Loja)l.get(ind);
			System.out.println("Achou : "+ind);
			if(L instanceof Livro){
				System.out.println("É um livro");
			}
			if(L instanceof CD){
				System.out.println("É um CD");
			}
			if(L instanceof DVD){
				System.out.println("É um DVD");
			}
				
				
			
		}
		else
			System.out.println("nao");
		
		*/
		/*if(l.contains(new DVD("fbv"))){
			System.out.println("Existe");
		}
		System.out.println(l);
		((Loja)l.get(2)).setNome("BOOFFFF");
		l2.add(new DVD("osl","Emoji",5.5,3.5));
		l2.add(new Livro("abc","Saber",15.5,"Daniel"));
		System.out.println(l);
		l.removeAll(l2);
		System.out.println(l);*/
	}
}
