

public class Filme implements Comparable<Filme>{
	private String titulo;
	private int ano;
	
	
	public int getAno(){
		return this.ano;
	}
	public void setAno(int num){
		this.ano=num;
	}
	public Filme(String t,int a){
		titulo=t;
		this.ano=a;
		
	}
	public Filme(String t,String a){
		titulo=t;
		this.ano=Integer.parseInt(a);
	}
	
	public boolean equals(Object variavel){
		if(variavel instanceof Filme){
			Filme f = (Filme)variavel;
			if(this.titulo.equals(f.titulo) ){
				if(this.ano == f.ano){
					return true;
				}
			}
			
		}
		return false;
	}
	public String toString(){
		return titulo+"/" + ano +"/";
	}
	public int compareTo(Filme f){
		return this.ano - f.ano;
		/*OU
		 * if(this.ano>f.ano){
		 * 	return 1;
		 * }
		 * if(this.ano<f.ano){
		 * 	return -1;
		 * }
		 * return 0;
		 */
	}
	
}
