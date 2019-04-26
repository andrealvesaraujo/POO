package prodPlan;

public class Parafuso extends Parte{
	protected float  comprimento;
	protected float diametro;
	
	public Parafuso(float comp,float diam){
		this.comprimento=comp;
		this.diametro=diam;
	}
	
	public float getComprimento() {
		return comprimento;
	}


	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}


	public float getDiametro() {
		return diametro;
	}


	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}


	public Parafuso(int codigo,String nome,String desc,float valor,float comp,float diam){
		super(codigo,nome,desc,valor);
		this.comprimento=comp;
		this.diametro=diam;
	}
	
	
	public String toString(){
		return "È um parafuso com comprimento : " +comprimento +" e diamentro: "+diametro;
	}
	
	
	
	public boolean equals(Object o){
		if(o instanceof Parafuso){
				if((this.comprimento ==((Parafuso) o).comprimento) && (this.diametro ==((Parafuso) o).diametro)){
					System.out.println("São Parafusos iguais");
					return true;
				}
				System.out.println("É outro Parafuso");
				return false;
		}else{
			System.out.println("É outro objeto");
			
			return false;
			
		}
	}
	
	
	
	
	
	
	
	
}
